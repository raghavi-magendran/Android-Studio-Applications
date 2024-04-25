package com.example.practiceapplication04;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;

import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


public class Instructions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_instructions);


        int accentColor = ContextCompat.getColor(this, R.color.accentColor);

        TextView instruction1 = findViewById(R.id.instruction1);
        SpannableString spannableString1 = new SpannableString("\"1\" or \"2\" to select an option.");
        spannableString1.setSpan(new ForegroundColorSpan(accentColor), 0, 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString1.setSpan(new ForegroundColorSpan(Color.WHITE), 4, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString1.setSpan(new ForegroundColorSpan(accentColor), 7, 10, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString1.setSpan(new ForegroundColorSpan(Color.WHITE), 11, 30, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        instruction1.setText(spannableString1);

        TextView instruction2 = findViewById(R.id.instruction2);
        SpannableString spannableString2 = new SpannableString("\"OK\" to confirm your \"choice\".");
        spannableString2.setSpan(new ForegroundColorSpan(accentColor), 0, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString2.setSpan(new ForegroundColorSpan(Color.WHITE), 5, 29, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        instruction2.setText(spannableString2);

        TextView instruction3 = findViewById(R.id.instruction3);
        SpannableString spannableString3 = new SpannableString("Buttons on the touchpad to select an option.");
        spannableString3.setSpan(new ForegroundColorSpan(accentColor), 0, 23, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // Apply accentColor up to the word "touchpad"
        spannableString3.setSpan(new ForegroundColorSpan(Color.WHITE), 24, spannableString3.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE); // Apply white color to the rest of the text
        instruction3.setText(spannableString3);


        TextView instruction4 = findViewById(R.id.instruction4);
        SpannableString spannableString4 = new SpannableString("\"TAP\"to confirm your choice.");
        spannableString4.setSpan(new ForegroundColorSpan(accentColor), 0, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableString4.setSpan(new ForegroundColorSpan(Color.WHITE), 9, 24, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        instruction4.setText(spannableString4);


        Button backBtn = findViewById(R.id.previouspageBtn);
        backBtn.setOnClickListener(v -> {
           // Intent intent = new Intent(Instructions.this, HomePage.class);
           // startActivity(intent);
            finish();
        });
    }
}