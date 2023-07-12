package com.example.android.chatingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.android.chatingapp.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

ActivitySignUpBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        binding=ActivitySignUpBinding.inflate((getLayoutInflater()));
        setContentView(binding.getRoot());
        getSupportActionBar();
    }
}