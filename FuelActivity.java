package com.example.blackbox;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class FuelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fuel_activity); // Set the layout for this activity

        // Find TextViews by their IDs
        TextView fuelType = findViewById(R.id.textFuelType);
        TextView fuelLevel = findViewById(R.id.textFuelLevel);

        // Set the text for each TextView
        fuelType.setText("Fuel Type: Gasoline");
        fuelLevel.setText("Fuel Level: 75%");
        // Set additional details for other TextViews if needed
    }
}
