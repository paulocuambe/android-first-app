package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnFirstFragment = findViewById(R.id.btnFragment1);
        Button btnSecondFragment = findViewById(R.id.btnFragment2);

        FirstFragment firstFragment = new FirstFragment();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.flFragment, firstFragment)
                .addToBackStack(null)
                .commit();

        btnFirstFragment.setOnClickListener(e -> {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flFragment, firstFragment)
                    .commit();
        });

        SecondFragment secondFragment = new SecondFragment();
        btnSecondFragment.setOnClickListener(e -> {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.flFragment, secondFragment)
                    .addToBackStack(null)
                    .commit();
        });
    }
}