package com.example.intersetcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Calculate;
    private EditText Rate,Principal,Year;
    private TextView Answer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculate=findViewById(R.id.scalculate);
        Rate=findViewById(R.id.etRate);
        Principal=findViewById(R.id.etPrinciple);
        Year=findViewById(R.id.etYears);
        Answer=findViewById(R.id.tvAnswer);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getR=Rate.getText().toString();
                String getP=Principal.getText().toString();
                String getY=Year.getText().toString();

                float R=Float.parseFloat(getR);
                float P=Float.parseFloat(getP);
                float Y=Float.parseFloat(getY);

                float NewR=R/100;
                float I=P*NewR*Y;

                Answer.setText(" The Interset "+I);



            }
        });

    }
}