package com.example.blackbox;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DriverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.driver_activity); // Replace 'your_layout_file' with the XML file name

        TextView deceleration = findViewById(R.id.textView22);
        TextView drivingAnalysis = findViewById(R.id.textView18);
        TextView acceleration = findViewById(R.id.textView15);
        TextView averageSpeed = findViewById(R.id.textView2);
        TextView intakeAirTemp = findViewById(R.id.textView4);
        TextView engineCoolantTemp = findViewById(R.id.textView16);
        TextView avgAcceleration = findViewById(R.id.textView17);
        TextView distanceTraveled = findViewById(R.id.textView14);
        TextView engineRPM = findViewById(R.id.textView13);
        TextView vehicleSpeed = findViewById(R.id.textView);
        // You can similarly find the Flow widget

        deceleration.setText(" Deceleration                   0 m/s^2");
        drivingAnalysis.setText("DRIVING ANALYSIS");
        acceleration.setText(" Acceleration                 0.7 m/s^2");
        averageSpeed.setText(" Average Speed                60 km/h");
        intakeAirTemp.setText(" Intake air Temp                    28°C");
        engineCoolantTemp.setText(" Engine Coolant Temp         85°C");
        avgAcceleration.setText(" Average Acceleration  0.5 m/s^2");
        distanceTraveled.setText(" Distance Traveled              15 km");
        engineRPM.setText(" Engine RPM                  3000 rpm");
        vehicleSpeed.setText(" Vehicle Speed                  65 km/h");
        // Set any additional properties or text as needed
    }
}
