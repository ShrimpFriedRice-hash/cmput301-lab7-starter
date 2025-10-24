package com.example.androiduitesting;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ShowActivity extends AppCompatActivity {
    Button backButton;
    TextView cityView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        backButton = findViewById(R.id.backButton);
        cityView = findViewById(R.id.cityShow);

        //https://stackoverflow.com/questions/2091465/how-do-i-pass-data-between-activities-in-android-application
        //showed me how to use intent
        String cityName = getIntent().getStringExtra("city_name");

        cityView.setText(cityName);
        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }

        });

    }
}
