package com.optimus.netapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button optimusButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       optimusButton = (Button) findViewById(R.id.optimusButton);

       optimusButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               TextView optimusText = (TextView) findViewById(R.id.optimusText);
               optimusText.setTextSize(55);
           }
       });

    }
}
