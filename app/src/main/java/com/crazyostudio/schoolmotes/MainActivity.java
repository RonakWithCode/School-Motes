package com.crazyostudio.schoolmotes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.crazyostudio.schoolmotes.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}