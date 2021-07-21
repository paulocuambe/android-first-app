package com.gosenx.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnOrder = findViewById(R.id.btnOrder);
        btnOrder.setOnClickListener(e -> {
            RadioGroup rgMeat = findViewById(R.id.rgMeat);
            RadioButton rgChosenMeat = findViewById(rgMeat.getCheckedRadioButtonId());

            CheckBox cbCheese = findViewById(R.id.cbCheese);
            CheckBox cbOnions = findViewById(R.id.cbOnions);
            CheckBox cbSalad = findViewById(R.id.cbSalad);

            TextView tvOrder = findViewById(R.id.tvOrder);

            boolean cheese = cbCheese.isChecked();
            boolean onions = cbOnions.isChecked();
            boolean salad = cbSalad.isChecked();

            String order = "You ordered a burger with: \n" +
                    rgChosenMeat.getText() + "\n" +
                    (salad ? cbSalad.getText() + "\n" : "") +
                    (cheese ? cbCheese.getText() + "\n" : "") +
                    (onions ? cbOnions.getText() + "\n" : "");

            tvOrder.setText(order);

        });
    }
}