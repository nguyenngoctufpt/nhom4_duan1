package com.example.da1_poly_n6.FragmentManager;

import static android.content.ContentValues.TAG;

import android.app.Dialog;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

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

import com.example.da1_poly_n6.DAOModel.DAOUser;
import com.example.da1_poly_n6.Model.LuuHoaDon;
import com.example.da1_poly_n6.Model.User;
import com.example.da1_poly_n6.R;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class SuaNVFrgm extends Fragment {





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sua_n_v_frgm, container, false);



        return view;
    }
}