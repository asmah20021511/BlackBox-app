package com.example.blackbox;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_activity);

        TextView carNumber = findViewById(R.id.number);
        TextView model = findViewById(R.id.model);
        TextView transmission = findViewById(R.id.transmission);
        TextView engine = findViewById(R.id.engine);
        TextView power = findViewById(R.id.power);
        TextView mielage = findViewById(R.id.mielage);
        TextView car = findViewById(R.id.car);
        TextView owner = findViewById(R.id.owner);
        // You can similarly find the ImageView

        carNumber.setText("CAR NO. : KA06 HD 1515");
        model.setText("MODEL : 2018");
        transmission.setText("TRANSMISSION : Manual");
        engine.setText("ENGINE : 999cc");
        power.setText("POWER : 75.0 bhp");
        mielage.setText("MIELAGE : 18.78 kmpl");
        car.setText("CAR : Volswagen Polo 1.0 MPI Trendline BSIV");
        owner.setText("OWNER : ALEX COSTA");
        // Set any additional properties, text or image resources as needed
    }
}
