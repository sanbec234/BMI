package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button calculateBmiBtn;
    EditText heightEt;
    EditText weightEt;
    TextView bmiValueTxt;
    TextView bmi;
    TextView reduceweight;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculateBmiBtn = findViewById(R.id.calculate_bmi_btn);
        heightEt = findViewById(R.id.height_et);
        weightEt = findViewById(R.id.weight_et);
        bmiValueTxt = findViewById(R.id.bmi_value_text);
        bmi = findViewById(R.id.bmi_value);
        reduceweight = findViewById(R.id.reduce_weight);




        calculateBmiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float heightValue = Float.parseFloat(heightEt.getText().toString());
                float weightValue = Float.parseFloat(weightEt.getText().toString());

                float bmiValue = (weightValue/( heightValue*heightValue));
                float a = (float) (24.9*heightValue*heightValue);
                float b= weightValue;
                float correction1 = (a-b);
                float correction2 = (b-a);
                bmi.setText(String.valueOf(bmiValue));

                if (bmiValue<18.5){
                    bmiValueTxt.setText("You are underweighted for your height");
                    reduceweight.setText("you must gain" +correction1+ "kgs.");
                    
                }
                else if (bmiValue<24.9){
                    bmiValueTxt.setText("You are correct on weight" );
                }
                else if (bmiValue<29.9){
                    bmiValueTxt.setText("You are overweighted.");
                    reduceweight.setText("you must loose" +correction2+ "kgs.");
                }
                else if (bmiValue<34.9){
                    bmiValueTxt.setText("You are on obesity class 1.");
                    reduceweight.setText("you must loose" +correction2+ "kgs.");
                }
                else if (bmiValue<39.9){
                    bmiValueTxt.setText("You are on obesity class 2.");
                    reduceweight.setText("you must loose" +correction2+ "kgs.");
                }
                else if (bmiValue>39.9){
                    bmiValueTxt.setText("You are on obesity class 3.");
                    reduceweight.setText("you must loose"+correction2+ "kgs.");

                }


            }
        });

    }
}