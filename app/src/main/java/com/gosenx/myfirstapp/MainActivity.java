package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnShowToast = findViewById(R.id.btnShowToast);

        btnShowToast.setOnClickListener(e -> {
            Toast toast = new Toast(this);
            LayoutInflater inflater = LayoutInflater.from(this);

            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(inflater.inflate(R.layout.custom_toast, findViewById(R.id.clToast)));
            toast.show();
        });

    }
}