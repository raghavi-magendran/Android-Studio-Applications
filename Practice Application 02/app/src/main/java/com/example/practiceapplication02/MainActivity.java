package com.example.practiceapplication02;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       // ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        //   Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        //    v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
      //    return insets;
      //  });
    }
    public void onBtnClicked (View view)
    {
        TextView firstName = findViewById(R.id.firstName);
        TextView secondName = findViewById(R.id.secondName);
        TextView greeting = findViewById(R.id.welcomeMsg);
        String fn = firstName.getText().toString();
        String sn = secondName.getText().toString();
        greeting.setText("Hello" + fn + sn);
    }
}

