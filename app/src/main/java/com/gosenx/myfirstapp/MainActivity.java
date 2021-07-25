package com.gosenx.myfirstapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.app_bar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        String message = "You clicked on %s.";
        String clickedItem = "";

        if (item.getItemId() == R.id.miAddContact) {
            clickedItem = "Add Contact";
        } else if (item.getItemId() == R.id.miClose) {
            clickedItem = "Close";
            finish();
        } else if (item.getItemId() == R.id.miFavorite) {
            clickedItem = "Favorite";
        } else if (item.getItemId() == R.id.miFeedback) {
            clickedItem = "Give feedback";
        } else if (item.getItemId() == R.id.miSettings) {
            clickedItem = "Settings";
        }

        Toast.makeText(this, String.format(message, clickedItem), Toast.LENGTH_SHORT).show();
        return true;
    }
}