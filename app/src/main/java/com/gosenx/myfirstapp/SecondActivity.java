package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView tvPerson = findViewById(R.id.tvPerson);

        Person person = (Person) getIntent().getSerializableExtra("EXTRA_PERSON");
        String message = String.format("%s is %s years old and is from %s.", person.name, person.age, person.country);
        
        tvPerson.setText(message);
    }
}