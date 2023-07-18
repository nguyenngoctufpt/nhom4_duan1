package com.example.da1_poly_n6.FragmentManager;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.viewmodel.CreationExtras;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.da1_poly_n6.R;

import java.util.ArrayList;

public class ChiTietSPSuaFrgm extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chi_tiet_s_p_sua_frgm, container, false);
        return view;
    }


}