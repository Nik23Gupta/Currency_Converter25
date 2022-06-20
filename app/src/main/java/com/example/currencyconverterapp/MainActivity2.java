package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button button;
    private TextView textView3;
    private EditText num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        textView3 = findViewById(R.id.textView3);
        num = findViewById(R.id.num);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Converting!!", Toast.LENGTH_SHORT).show();
                String s = num.getText().toString();
                int dollar = Integer.parseInt(s);
                double rupees = 77.95 * dollar;
                textView3.setText(dollar + "$ is equal to " + rupees + " INR");


            }
        });
    }
}