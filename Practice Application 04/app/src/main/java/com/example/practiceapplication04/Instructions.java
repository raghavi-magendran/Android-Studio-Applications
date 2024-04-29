package com.example.practiceapplication04;


import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
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

        setTextColor();
        Button backBtn = findViewById(R.id.previouspageBtn);
        backBtn.setOnClickListener(v -> {
            finish();
        });
    }

    public void setTextColor()

    {
        TextView instruction1 = findViewById(R.id.instruction1);
        String message1 = "<font color='#BB86FC'> \"1\" </font> or <font color='#BB86FC'>\"2\" </font> to select an option. ";
        instruction1.setText(Html.fromHtml(message1, Html.FROM_HTML_MODE_LEGACY));

        TextView instruction2 = findViewById(R.id.instruction2);
        String message2 = "<font color='#BB86FC'> \"OK\" </font> to confirm your \"choice\". ";
        instruction2.setText(Html.fromHtml(message2, Html.FROM_HTML_MODE_LEGACY));

        TextView instruction3 = findViewById(R.id.instruction3);
        String message3 = "<font color='#BB86FC'> Buttons on the touchpad </font> to select an option. ";
        instruction3.setText(Html.fromHtml(message3, Html.FROM_HTML_MODE_LEGACY));

        TextView instruction4 = findViewById(R.id.instruction4);
        String message4 = "<font color='#BB86FC'> \"TAP\" </font> to confirm your choice.";
        instruction4.setText(Html.fromHtml(message4, Html.FROM_HTML_MODE_LEGACY));
    }
}