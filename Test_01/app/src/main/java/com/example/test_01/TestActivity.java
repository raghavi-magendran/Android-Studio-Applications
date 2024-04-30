package com.example.test_01;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;


public class TestActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        TextView i1 = findViewById(R.id.instruction1);
        String message = "<font color='#BB86FC'> \"1\" </font> or <font color='#BB86FC'>\"2\" </font> to select an option. ";
        i1.setText(Html.fromHtml(message, Html.FROM_HTML_MODE_LEGACY));

        Log.v("success01", "Verbose message");
        Log.d("debug02", "Debug message");
        Log.i("info03", "Information message");
        Log.w("warn04", "Warning message");
        Log.e("error05", "Error message");
        Log.wtf("assert06", "Assert message");
    }

}