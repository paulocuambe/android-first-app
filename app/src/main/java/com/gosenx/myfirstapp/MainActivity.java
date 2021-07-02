package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            TextView textValue = findViewById(R.id.text_value);
            int value = Integer.parseInt(textValue.getText().toString());
            Integer newValue = MyWorker.doubleTheValue(value);

            textValue.setText(newValue.toString());

            Snackbar.make(view, String.format("Value updated from %d to %d", value, newValue), Snackbar.LENGTH_LONG)
                    .setAction("Action", null)
                    .show();
        });
    }
}