package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(e -> {
            int firstNumber = getElementValue(R.id.etFirstNumber);
            int secondNumber = getElementValue(R.id.etSecondNumber);
            String result = String.valueOf(firstNumber + secondNumber);
            TextView tvResult = findViewById(R.id.tvResult);
            tvResult.setText(result);
        });
    }

    private int getElementValue(int i) {
        return Integer.parseInt(((EditText) findViewById(i)).getText().toString());
    }
}