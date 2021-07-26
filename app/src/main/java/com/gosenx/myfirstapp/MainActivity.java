package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FirstFragment firstFragment = new FirstFragment();
        SecondFragment secondFragment = new SecondFragment();
        ThirdFragment thirdFragment = new ThirdFragment();


        setCurrentFragment(firstFragment);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(e -> {
            if (e.getItemId() == R.id.miHome) {
                setCurrentFragment(firstFragment);
            } else if (e.getItemId() == R.id.miMessages) {
                setCurrentFragment(secondFragment);
            } else {
                setCurrentFragment(thirdFragment);
            }
            return true;
        });

        BadgeDrawable badge = bottomNavigationView.getOrCreateBadge(R.id.miMessages);
        badge.setNumber(11);
        badge.setBackgroundColor(getColor(R.color.design_default_color_primary));
        badge.setVisible(true);

    }

    private void setCurrentFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.flFragment, fragment)
                .addToBackStack(null)
                .commit();

    }
}