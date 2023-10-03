package com.ujjwalrockriser.tempconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText input;
    Button ftoc;
    Button ctof;
    TextView output;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = findViewById(R.id.input);
        ftoc = findViewById(R.id.farenhiet_to_celcius);
        ctof = findViewById(R.id.celcius_to_farenhiet);
        output = findViewById(R.id.output);

        ftoc.setOnClickListener(view -> {
            // Convert the input to a float when the button is clicked
            String inputValue = input.getText().toString();
            if (!inputValue.isEmpty()) {
                float value = Float.parseFloat(inputValue);
                float celcius = ((value - 32) * 5) / 9;
                output.setText(Float.toString(celcius));
            }
        });

        ctof.setOnClickListener(view -> {
            // Convert the input to a float when the button is clicked
            String inputValue = input.getText().toString();
            if (!inputValue.isEmpty()) {
                float value = Float.parseFloat(inputValue);
                float farenhiet = ((value * 9) / 5) + 32;
                output.setText(Float.toString(farenhiet));
            }
        });
    }
}