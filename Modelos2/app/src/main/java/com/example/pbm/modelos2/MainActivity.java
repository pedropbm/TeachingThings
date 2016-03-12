package com.example.pbm.modelos2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView(this);
        textView.setText("What?");
        textView.setTextSize(60);
        textView.setTextColor(Color.GREEN);


        setContentView(R.layout.activity_main);
    }
}
