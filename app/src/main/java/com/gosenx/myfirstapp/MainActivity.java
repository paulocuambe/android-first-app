package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOpenActivity = findViewById(R.id.btnOpenActivity);

        btnOpenActivity.setOnClickListener(e -> {
           Intent intent = new Intent(this, SecondActivity.class);
           startActivity(intent);
        });
    }
}