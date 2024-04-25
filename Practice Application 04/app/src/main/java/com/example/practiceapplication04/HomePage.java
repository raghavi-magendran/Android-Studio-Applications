package com.example.practiceapplication04;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class HomePage extends AppCompatActivity {

    public static final String NAME = "NAME";
    public static final String USERID = "USERID";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home_page);

        String name, userid;
        TextView helloMsg = findViewById(R.id.welcomeMsg);
        TextView userId = findViewById(R.id.userId);
        Intent intent = getIntent();
        name = intent.getStringExtra(NAME);
        userid = intent.getStringExtra(USERID);
        helloMsg.setText(String.format("Hello %s!!!", name));
        userId.setText(userid);
        Button nextPageBtn = findViewById(R.id.nextpageBtn);
        nextPageBtn.setOnClickListener(v -> {

            Intent intent2 = new Intent(HomePage.this, Instructions.class);
            startActivity(intent2);
        });
    }
}