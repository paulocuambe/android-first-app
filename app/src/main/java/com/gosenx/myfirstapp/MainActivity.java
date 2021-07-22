package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnApply = findViewById(R.id.btnApply);

        btnApply.setOnClickListener(e -> {
            Intent intent = new Intent(this, SecondActivity.class);
            Person person = new Person(extractText(R.id.etName), Integer.parseInt(extractText(R.id.etAge)), extractText(R.id.etCountry));

            intent.putExtra("EXTRA_PERSON", person);
            startActivity(intent);
        });
    }

    private String extractText(int id){
        return ((EditText) findViewById(id)).getText().toString();
    }
}