package com.gosenx.myfirstapp;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnRequestPermissions = findViewById(R.id.btnRequestPermissions);

        btnRequestPermissions.setOnClickListener(e -> {
            requestPermissions();
        });
    }


    private void requestPermissions() {
        List<String> permissions = new ArrayList<>();

        if (!hasWriteExternalPermission()) {
            permissions.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        }

        if (!hasForeGroungPermission()) {
            permissions.add(Manifest.permission.ACCESS_COARSE_LOCATION);
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            if (!hasBackGroundPermission()) {
                permissions.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION);
            }
        }

        if (!permissions.isEmpty()) {
            ActivityCompat.requestPermissions(this, permissions.toArray(new String[0]), 0);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 0) {
            for (int i = 0; i < grantResults.length; i++) {
                if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                    Log.d("PermissionsRequest", String.format("%s granted.", permissions[i]));
                }
            }
        }
    }

    private boolean hasWriteExternalPermission() {
        return hasPermimmission(Manifest.permission.WRITE_EXTERNAL_STORAGE);
    }

    private boolean hasForeGroungPermission() {
        return hasPermimmission(Manifest.permission.ACCESS_COARSE_LOCATION);
    }

    @RequiresApi(api = Build.VERSION_CODES.Q)
    private boolean hasBackGroundPermission() {
        return hasPermimmission(Manifest.permission.ACCESS_BACKGROUND_LOCATION);
    }

    private boolean hasPermimmission(String permission) {
        return ActivityCompat.checkSelfPermission(this, permission) == PackageManager.PERMISSION_GRANTED;
    }
}