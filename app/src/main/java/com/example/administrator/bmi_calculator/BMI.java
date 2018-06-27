package com.example.administrator.bmi_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        Button result;
        result = (Button) findViewById(R.id.result);
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtHeight, edtWeight;
                TextView txtMsg;
                double bmi, height, weight;
                edtHeight = (EditText) findViewById(R.id.height);
                edtWeight = (EditText) findViewById(R.id.weight);
                txtMsg = (TextView) findViewById(R.id.msg);
                height = Double.parseDouble(edtHeight.getText().toString()) / 100;
                weight = Double.parseDouble(edtWeight.getText().toString());
                bmi = weight / Math.pow(height, 2);
                txtMsg.setText("您的BMI是" + String.valueOf(bmi));
            }
        });
    }
}
