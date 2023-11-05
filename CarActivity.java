package com.example.blackbox;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class CarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_activity); // Replace 'your_layout_file' with the XML file name

        TextView acRefrigerant = findViewById(R.id.textView22);
        TextView carHealth = findViewById(R.id.textView18);
        TextView evaporativeSystem = findViewById(R.id.textView15);
        TextView fuelSystem = findViewById(R.id.textView2);
        TextView secondaryAirSystem = findViewById(R.id.textView4);
        TextView ergSystem = findViewById(R.id.textView16);
        TextView oxygenSensor = findViewById(R.id.textView17);
        TextView catalyst = findViewById(R.id.textView14);
        TextView components = findViewById(R.id.textView13);
        TextView misfire = findViewById(R.id.textView);

        acRefrigerant.setText(" A/C Refridgerant             Passed");
        carHealth.setText("CAR HEALTH");
        evaporativeSystem.setText(" Evaporative System        Passed");
        fuelSystem.setText(" Fuel System                     Passed");
        secondaryAirSystem.setText(" Secondary Air System    Passed");
        ergSystem.setText(" ERG System                     Passed");
        oxygenSensor.setText(" Oxygen Sensonr              Passed");
        catalyst.setText(" Catalyst                            Passed");
        components.setText(" Components                    Passed  ");
        misfire.setText(" Misfire                              Passed");
        // Set any additional properties, text, or styles as needed
    }
}