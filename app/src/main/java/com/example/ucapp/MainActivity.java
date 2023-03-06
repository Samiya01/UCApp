package com.example.ucapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextMeters;
    private Button buttonConvert;
    private TextView textViewFeet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextMeters = findViewById(R.id.editText_meters);
        buttonConvert = findViewById(R.id.button_convert);
        textViewFeet = findViewById(R.id.textView_feet);

        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Convert meters to feet
                double meters = Double.parseDouble(editTextMeters.getText().toString());
                double feet = meters * 3.28084;

                // Display result in feet
                textViewFeet.setText(String.format("%.2f feet", feet));
            }
        });
    }
}
