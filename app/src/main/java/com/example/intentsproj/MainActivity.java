package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating the LayoutInFlaster instance
        LayoutInflater li =  getLayoutInflater();
        //Getting the View object as deFind in the custom_toast.xml file
        View layout = li.inflate(R.layout.custom_toast_layout,(ViewGroup)findViewById(R.id.custom_toast_layout));

        //Creating the Toast object
        Toast toast = new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.setView(layout); // setting the view of custom toast layout
        toast.show();

        //Conect to first Activity after displaying the custom toast message

        Intent intent = new Intent(this,FirstActivity.class);
        startActivity(intent);
    }
}