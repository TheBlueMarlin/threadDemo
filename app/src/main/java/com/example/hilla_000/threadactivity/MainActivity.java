package com.example.hilla_000.threadactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set text object:
        TextView counterDisplay;

        counterDisplay = (TextView)findViewById(R.id.Counter);


        counterDisplay.setText("");
    }
}
