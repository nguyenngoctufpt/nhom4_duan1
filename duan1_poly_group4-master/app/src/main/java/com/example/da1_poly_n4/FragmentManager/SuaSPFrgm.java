package com.example.da1_poly_n4.FragmentManager;



import android.os.Bundle;


import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.EditText;
import android.widget.ImageView;

import com.example.da1_poly_n4.R;


public class SuaSPFrgm extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sua_s_p_frgm, container, false);
        // ánh xạ
        ImageView btnBackSuaSP = view.findViewById(R.id.btnBackSuaSP);
        EditText btnSuaSPHuy = view.findViewById(R.id.btnSuaSPHuy);
        EditText btnSuaSPXN = view.findViewById(R.id.btnUpdateSp);

        return view;
    }
}