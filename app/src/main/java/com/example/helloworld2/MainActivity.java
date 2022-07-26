package com.example.helloworld2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnOK = findViewById(R.id.ok);
        btnOK.setOnClickListener(new
                                         View.OnClickListener() {
                                             @Override
                                             public void onClick(View V) {
                                                 btnOK.setBackgroundColor(Color.RED);
                                             }
                                         });
    };
};
