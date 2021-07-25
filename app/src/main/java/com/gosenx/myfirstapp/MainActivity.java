package com.gosenx.myfirstapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDialog1 = findViewById(R.id.btnDialog1);
        Button btnDialog2 = findViewById(R.id.btnDialog2);
        Button btnDialog3 = findViewById(R.id.btnDialog3);

        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Add contact")
                .setMessage("You want to add Mr. Paul to your contacts list?")
                .setIcon(R.drawable.ic_add_contact)
                .setPositiveButton("Yes", (dialog, which) -> {
                    Toast.makeText(this, "Mr. Paul has been added to your contacts list.", Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton("No", (dialog, which) -> {
                    Toast.makeText(this, "Mr. Paul won't be added to your contacts list.", Toast.LENGTH_SHORT).show();
                })
                .create();

        btnDialog1.setOnClickListener(e -> {
            alertDialog.show();
        });

        String[] options = {"First Option", "Second Option", "Third Option"};
        AlertDialog singleOptionAlertDialog = new AlertDialog.Builder(this)
                .setTitle("Choose one of these options")
                .setSingleChoiceItems(options, 0, (dialog, which) -> {
                    Toast.makeText(this, String.format("You clicked on %s", options[which]), Toast.LENGTH_SHORT).show();
                })
                .setPositiveButton("Accept", (dialog, which) -> {
                    Toast.makeText(this, "You accepted the single choice dialog.", Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton("No", (dialog, which) -> {
                    Toast.makeText(this, "You declined the single choice dialog.", Toast.LENGTH_SHORT).show();
                })
                .create();

        btnDialog2.setOnClickListener(e -> {
            singleOptionAlertDialog.show();
        });

        AlertDialog multiChoiceAlertDialog = new AlertDialog.Builder(this)
                .setTitle("Choose one of these options")
                .setMultiChoiceItems(options, new boolean[]{true, false, true}, (dialog, which, isChecked) -> {
                    if (isChecked) {
                        Toast.makeText(this, String.format("You checked %s.", options[which]), Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(this, String.format("You unchecked %s.", options[which]), Toast.LENGTH_SHORT).show();
                    }
                })
                .setPositiveButton("Accept", (dialog, which) -> {
                    Toast.makeText(this, "You accepted the multi choice dialog.", Toast.LENGTH_SHORT).show();
                })
                .setNegativeButton("No", (dialog, which) -> {
                    Toast.makeText(this, "You declined the multi choice dialog.", Toast.LENGTH_SHORT).show();
                })
                .create();

        btnDialog3.setOnClickListener(e -> {
            multiChoiceAlertDialog.show();
        });
    }
}