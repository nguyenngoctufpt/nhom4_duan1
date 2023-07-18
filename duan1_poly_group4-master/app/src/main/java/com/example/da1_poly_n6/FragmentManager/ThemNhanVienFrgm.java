package com.example.da1_poly_n6.FragmentManager;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.da1_poly_n6.DAOModel.DAOChucVu;
import com.example.da1_poly_n6.DAOModel.DAOUser;
import com.example.da1_poly_n6.Model.ChucVu;
import com.example.da1_poly_n6.Model.User;
import com.example.da1_poly_n6.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class ThemNhanVienFrgm extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_them_nhan_vien_frgm, container, false);


        return view;
    }


}