package com.example.widget02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //  컨트롤
    private RadioGroup radioGroup;
    private CheckBox checkBox;
    private TextView radioChecker;
    private TextView checkboxChecker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  컨트롤 연결
        radioGroup = findViewById(R.id.radioGroup);
        checkBox = findViewById(R.id.checkBox);
        radioChecker = findViewById(R.id.radioChecker);
        checkboxChecker = findViewById(R.id.checkboxChecker);
    }
}