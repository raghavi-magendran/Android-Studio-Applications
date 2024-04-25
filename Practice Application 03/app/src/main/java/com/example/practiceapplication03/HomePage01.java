package com.example.practiceapplication03;

import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class HomePage01 extends AppCompatActivity {

    public static final String NAME = "NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.homepage);

        TextView welcomeMsg;
        String name;
        welcomeMsg = findViewById(R.id.welcome_msg);
        Intent intent = getIntent();
        name = intent.getStringExtra(NAME);
        welcomeMsg.setText(String.format("Hello %s!!!", name));

    }
}