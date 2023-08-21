package com.example.weatherforcast;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CityWeatherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_weather);

        // Find the button by ID
        TextView sevenDayForecastButton = findViewById(R.id.sevendayforecast);

        // Set a click listener for the button
        sevenDayForecastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start SevenDayForecastActivity when the button is clicked
                Intent intent = new Intent(CityWeatherActivity.this, SevenDayForcastActiviity.class);
                startActivity(intent);
            }
        });
    }
}
