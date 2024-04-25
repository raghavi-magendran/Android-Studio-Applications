package com.example.practiceapplication03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginPage extends AppCompatActivity {


    private EditText firstName;
    private EditText userName;
    private EditText password;

    //private String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.loginpage);

        Button btn = findViewById(R.id.login_button);
        firstName = findViewById(R.id.first_name);
        userName = findViewById(R.id.user_name);
        password = findViewById(R.id.user_password);
        btn.setOnClickListener(v -> {

            String username = userName.getText().toString().trim();
            String password = LoginPage.this.password.getText().toString().trim();
            if (isValidCredentials(username, password)) {
                welcomeUser();
            } else {
                Toast.makeText(LoginPage.this, "Invalid username or password", Toast.LENGTH_LONG).show();
            }
        });
    }

    public void welcomeUser() {
        //name = ;
        Intent intent = new Intent(LoginPage.this, HomePage.class);
        intent.putExtra(HomePage.NAME, firstName.getText().toString().trim());
        startActivity(intent);
    }

    private boolean isValidCredentials(String username, String password) {
        return username.equals("raghavi@gmail.com") && password.equals("abcd");
    }

}