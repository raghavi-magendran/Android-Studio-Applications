package com.example.practiceapplication03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class LoginPage01 extends AppCompatActivity {
    EditText name,userid,password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.loginpage);


        name = findViewById(R.id.first_name);
        userid = findViewById(R.id.user_name);
        password = findViewById(R.id.user_password);

        Button loginBtn = findViewById(R.id.login_button);

        loginBtn.setOnClickListener(v -> {


            String email = userid.getText().toString().trim();
            String passWord = password.getText().toString().trim();

           if(isValidCredentials(email, passWord))
           {
               welcomeUser();
           }
           else
           {
               Toast.makeText(this, "Incorrect email or password ", Toast.LENGTH_SHORT).show();
           }
        });
    }
    public void welcomeUser()
    {
        Intent intent = new Intent(LoginPage01.this, HomePage01.class);
        intent.putExtra(HomePage01.NAME, name.getText().toString().trim());
        startActivity(intent);
    }
    public boolean isValidCredentials(String emid, String pswd)
    {
        return emid.equals("user") && pswd.equals("user01");
    }
}