package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnApply);
        button.setOnClickListener(e -> {
            String firstName = getTextOfElement(R.id.etFirstName);
            String lastName = getTextOfElement(R.id.etLastName);
            String birthDate = getTextOfElement(R.id.etBirthDate);
            String country = getTextOfElement(R.id.etCountry);

            Log.d(this.getLocalClassName(), String.format("%s %s, born on %s, from %s has just registered.", firstName, lastName, birthDate, country));
        });
    }

    private String getTextOfElement(int i){
        return ((EditText) findViewById(i)).getText().toString();
    }
}