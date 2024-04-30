package com.example.practiceapplication07;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginPage extends AppCompatActivity {
    EditText emailId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        EditText password;
        emailId = findViewById(R.id.emailId);
        password = findViewById(R.id.password);
        Button btn = findViewById(R.id.loginButton);

        btn.setOnClickListener(v -> {
            String email = emailId.getText().toString().trim();
            String userPassword = password.getText().toString().trim();
            if (isValidCredentials(email, userPassword)) {
                displayHomePage();
            } else {
                Toast.makeText(this, "The email or password is incorrect", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void displayHomePage() {
        Intent intent = new Intent(LoginPage.this, HomePage.class);
        startActivity(intent);
    }

    public boolean isValidCredentials(String email, String password) {
        return email.equals("user") && password.equals("user");
    }

}