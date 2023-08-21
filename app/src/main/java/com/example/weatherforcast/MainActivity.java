package com.example.weatherforcast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStart = findViewById(R.id.btnstart);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Handle button click here
                navigateToAnotherActivity();
            }
        });
    }

    private void navigateToAnotherActivity() {
        Intent intent = new Intent(this, CityWeatherActivity.class); // Replace AnotherActivity with your target activity class
        startActivity(intent);
    }
}
