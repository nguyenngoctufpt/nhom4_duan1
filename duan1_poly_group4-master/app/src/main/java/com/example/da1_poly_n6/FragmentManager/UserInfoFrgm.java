package com.example.da1_poly_n6.FragmentManager;

import android.content.SharedPreferences;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.da1_poly_n6.DAOModel.DAOUser;
import com.example.da1_poly_n6.Model.User;
import com.example.da1_poly_n6.R;

public class UserInfoFrgm extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_user_info_frgm, container, false);

//
        return view;
    }
}