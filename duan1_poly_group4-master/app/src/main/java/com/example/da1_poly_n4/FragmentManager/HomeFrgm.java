package com.example.da1_poly_n6.FragmentManager;

import static android.content.ContentValues.TAG;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.da1_poly_n6.Adapter_Package.AdapterHome;
import com.example.da1_poly_n6.Adapter_Package.AdapterSanPham;
import com.example.da1_poly_n6.DAOModel.DAOLuuHD;
import com.example.da1_poly_n6.DAOModel.DAOSanPham;
import com.example.da1_poly_n6.DAOModel.DAOUser;
import com.example.da1_poly_n6.Model.SanPham;
import com.example.da1_poly_n6.Model.TheLoai;
import com.example.da1_poly_n6.Model.User;
import com.example.da1_poly_n6.R;

import java.util.ArrayList;

public class HomeFrgm extends Fragment {

    RecyclerView recycler_SPBanChay;
    private AdapterHome adapterHome;
    private ArrayList<SanPham> listSpTopOut = new ArrayList<>();
    DAOLuuHD daoLuuHD;
    DAOSanPham daoSanPham;
    LinearLayout layoutParent;
    DAOUser daoUser;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home_frgm, container, false);
        ImageView imgNotifi = view.findViewById(R.id.imgNotifi);
        layoutParent = view.findViewById(R.id.layoutParent);
        recycler_SPBanChay = view.findViewById(R.id.recycler_SPBanChay);
        TextView txtHello = view.findViewById(R.id.txtHello);
        daoLuuHD = new DAOLuuHD(getContext());
        daoSanPham = new DAOSanPham(getContext());
        daoUser = new DAOUser(getContext());

        SharedPreferences pref = getActivity().getSharedPreferences("USER_FILE", getActivity().MODE_PRIVATE);
        int maUserNow = pref.getInt("MA", 0);



        ArrayList<SanPham> listSanPham = daoSanPham.getAllProduct(0);
        ArrayList<Integer> listMaSPTop = daoLuuHD.getTopSP();
        for (int i = 0; i < listMaSPTop.size(); i++) {
            for (int j = 0; j < listSanPham.size(); j++) {
                if (listMaSPTop.get(i) == listSanPham.get(j).getId()){
                    listSpTopOut.add(listSanPham.get(j));
                }
            }
        }

        ArrayList<TheLoai> listLoaiSP = daoSanPham.getDSLSP();
        for (int i = 0; i < listLoaiSP.size(); i++) {
            ArrayList<SanPham> listSP = daoSanPham.getSPofTL(listLoaiSP.get(i).getMaLoai());
            if (listSP.size() != 0){
                View addLayout = inflater.inflate(R.layout.list_san_pham, null);
                TextView tittle = addLayout.findViewById(R.id.txtSPHomeTittle);
                tittle.setText(listLoaiSP.get(i).getTenLoai());
                RecyclerView recyclerViewAdd = addLayout.findViewById(R.id.recycler_SPTheoLoai);
                AdapterHome adapterHome1 = new AdapterHome(listSP, getContext());
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
                linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                recyclerViewAdd.setLayoutManager(linearLayoutManager);
                recyclerViewAdd.setAdapter(adapterHome1);
                layoutParent.addView(addLayout);
            }
        }

        adapterHome = new AdapterHome(listSpTopOut ,getActivity());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recycler_SPBanChay.setLayoutManager(linearLayoutManager);
        recycler_SPBanChay.setAdapter(adapterHome);

//        Notifi
        imgNotifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(getActivity());
                dialog.setContentView(R.layout.dialog_notifi);
                dialog.getWindow().setLayout(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.WRAP_CONTENT);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                EditText btnDongNotifi = dialog.findViewById(R.id.btnDongNotifi);
                btnDongNotifi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
                dialog.show();

            }
        });

        return view;
    }
}