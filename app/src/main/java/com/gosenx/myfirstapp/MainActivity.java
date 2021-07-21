package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAddImage = findViewById(R.id.btnAddImage);
        ImageView ivImageView = findViewById(R.id.ivImageView);

        btnAddImage.setOnClickListener(e-> {
            ivImageView.setImageResource(R.drawable.paulo);
        });
    }
}