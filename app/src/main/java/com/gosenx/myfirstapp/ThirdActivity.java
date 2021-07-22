package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button btnBack = findViewById(R.id.btnBackSecondActivity);

        btnBack.setOnClickListener(e -> {
            finish();
        });

    }
}