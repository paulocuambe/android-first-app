package com.gosenx.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button btnGoBack = findViewById(R.id.btnBack);
        Button btnThirdActivity = findViewById(R.id.btnThirdActivity);

        btnThirdActivity.setOnClickListener(e -> {
            Intent intent = new Intent(this, ThirdActivity.class);
            startActivity(intent);
        });

        btnGoBack.setOnClickListener(e -> {
            finish();
        });
    }
}
