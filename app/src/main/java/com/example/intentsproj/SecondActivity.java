package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.example.intentsproj.R.id.editText3;

public class SecondActivity extends AppCompatActivity {
    EditText number1,number2;
    TextView answer;
    Button plusbut,minusbut,multiplybut,dividebut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        number1 = (EditText) findViewById(R.id.editText);
        number2 = (EditText) findViewById(R.id.editText2);
        answer = (TextView) findViewById(R.id.textView5);
        plusbut = (Button) findViewById(R.id.button2);
        minusbut = (Button) findViewById(R.id.button3);
        multiplybut = (Button) findViewById(R.id.button4);
        dividebut = (Button) findViewById(R.id.button5);

         Intent intent = getIntent();

        final String num1 = intent.getStringExtra("number1");
        final String num2 = intent.getStringExtra("number2");

        final double n1 = Double.parseDouble(num1);
        final double n2 = Double.parseDouble(num2);


        number1.setText(num1);
        number2.setText(num2);

        plusbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = n1+n2;
                answer.setText(num1+" + "+num2+" = "+value);
            }
        });

        multiplybut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = n1*n2;
                answer.setText(num1+" x "+num2+" = "+value);
            }
        });

        dividebut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = n1/n2;
                answer.setText(num1+" / "+num2+" = "+value);
            }
        });

        minusbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double value = n1-n2;
                answer.setText(num1+" - "+num2+" = "+value);
            }
        });

    }
}
