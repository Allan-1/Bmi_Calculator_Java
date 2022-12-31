package com.example.bmicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateBmi(View view){
        DecimalFormat df = new DecimalFormat("0.00");
        EditText heightText = findViewById(R.id.height);
        EditText weightText =  findViewById(R.id.weight);
        TextView bmi =  findViewById(R.id.bmi);

        int height = Integer.parseInt(heightText.getText().toString()) ;
        int weight =  Integer.parseInt(weightText.getText().toString());

        double bmi_calc = weight / ((height*height * 1.0)/10000);
        bmi.setText(getString(R.string.bmi_result, df.format(bmi_calc)));
    }
}