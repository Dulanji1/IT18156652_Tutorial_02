package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
    Button okButton;
     EditText number1,number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        okButton = (Button) findViewById(R.id.button);
        number1 = (EditText) findViewById(R.id.editText3);
        number2 = (EditText) findViewById(R.id.editText4);

        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });
    }
    public void openActivity(){
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("number1",number1.getText().toString());
        intent.putExtra("number2",number2.getText().toString());
        startActivity(intent);
        Context context = getApplicationContext();
        //The context to use
        CharSequence message = "you just clicked the ok button";
        //Display String
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,message,duration);
        toast.show();
    }
}
