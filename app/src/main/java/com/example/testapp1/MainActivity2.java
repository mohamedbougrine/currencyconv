package com.example.testapp1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity2 extends AppCompatActivity {

    private Button submitBtn;
    private EditText valueInput;
    private CheckBox eurBtn, dollarBtn;
    private TextView eurTxt, dollartxt;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        submitBtn = findViewById(R.id.submitBtn);
        valueInput = findViewById(R.id.valueInput);
        eurBtn = findViewById(R.id.eurBtn);
        dollarBtn = findViewById(R.id.dollarBtn);
        eurTxt = findViewById(R.id.eurTxt);
        dollartxt = findViewById(R.id.dollartxt);

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    Double val = Double.parseDouble(valueInput.getText() + "");
                    eurTxt.setText("");
                    dollartxt.setText("");

                    DecimalFormat df = new DecimalFormat();
                    df.setMaximumFractionDigits(2);

                    if(eurBtn.isChecked()){
                        eurTxt.setText(df.format(val / 10)  + " €");

                    }
                    if(dollarBtn.isChecked()){
                        dollartxt.setText(df.format(val / 10.34) + " $");

                    }




            }
        });
    }
}