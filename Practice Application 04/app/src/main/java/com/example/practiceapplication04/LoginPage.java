package com.example.practiceapplication04;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {

    EditText fullName, emailId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login_page);

        fullName = findViewById(R.id.fullName);
        EditText password;
        emailId = findViewById(R.id.emailId);
        password = findViewById(R.id.password);
        Button btn = findViewById(R.id.loginButton);

        btn.setOnClickListener(v -> {
            String email = emailId.getText().toString().trim();
            String userPassword = password.getText().toString().trim();
            if (isValidCredentials(email, userPassword)) {
                displayHello();
            } else {
                Toast.makeText(this, "The email or password is incorrect", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void displayHello() {
        Intent intent = new Intent(LoginPage.this, HomePage.class);
        intent.putExtra(HomePage.NAME, fullName.getText().toString().trim());
        intent.putExtra(HomePage.USERID, emailId.getText().toString().trim());
        startActivity(intent);
    }

    public boolean isValidCredentials(String email, String password) {
        return email.equals("abcd@gmail.com") && password.equals("abcd");
    }
}