package com.example.da1_poly_n6.FragmentManager;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.da1_poly_n6.DAOModel.DAOChucVu;
import com.example.da1_poly_n6.DAOModel.DAOUser;
import com.example.da1_poly_n6.Model.ChucVu;
import com.example.da1_poly_n6.Model.LuuHoaDon;
import com.example.da1_poly_n6.Model.User;
import com.example.da1_poly_n6.R;

import java.util.ArrayList;

public class ViewUserInforFrgm extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_view_user_infor_frgm, container, false);

//
        return view;
    }
}