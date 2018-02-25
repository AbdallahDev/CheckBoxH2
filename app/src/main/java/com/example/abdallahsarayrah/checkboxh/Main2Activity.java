package com.example.abdallahsarayrah.checkboxh;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        double[] array_doubles = {2.5, 6.2, 8.2, 4846.354, 9.6};

// First position
        double firstNum = array_doubles[0]; // 2.5

// Last position
        double lastNum = array_doubles[array_doubles.length - 1]; // 9.6

    }
}
