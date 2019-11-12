package com.example.student6.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv= findViewById(R.id.label);
        Button tv2= findViewById(R.id.button);
        ActivityButton listner=new  ActivityButton(tv);
        tv2.setOnClickListener(listner);
    }
}
