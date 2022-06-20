package com.example.currencyconverterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = findViewById(R.id.button2);
        //button2.setOnClickListener(new View.OnClickListener() {
           // public void onClick(View v) {
                //Toast.makeText(MainActivity.this, "Welcome!!", Toast.LENGTH_SHORT).show();
                //Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                //startActivity(intent);
        //    }
        //});
    }
    public void OnClick(View view){Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);}
}






