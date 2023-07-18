package com.example.da1_poly_n6.FragmentManager;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.da1_poly_n6.Adapter_Package.AdapterGioHang;
import com.example.da1_poly_n6.Adapter_Package.AdapterHoaDon;
import com.example.da1_poly_n6.Adapter_Package.AdapterSanPham;
import com.example.da1_poly_n6.DAOModel.DAOGioHang;
import com.example.da1_poly_n6.DAOModel.DAOHoaDon;
import com.example.da1_poly_n6.DAOModel.DAOLuuHD;
import com.example.da1_poly_n6.DAOModel.DAOUser;
import com.example.da1_poly_n6.Model.GioHang;
import com.example.da1_poly_n6.Model.HoaDon;
import com.example.da1_poly_n6.Model.LuuHoaDon;
import com.example.da1_poly_n6.Model.SanPham;
import com.example.da1_poly_n6.Model.User;
import com.example.da1_poly_n6.R;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class StoreFrgm extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_store_frgm, container, false);


        return view;
    }

}