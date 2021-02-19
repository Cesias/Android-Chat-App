package com.example.cassavachat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    TextView registration_link;
    Button login_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

      login_button = findViewById(R.id.login_button);
        registration_link = findViewById(R.id.registration_link);

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        registration_link.setOnClickListener(new View.OnClickListener() {
                   @Override
         public void onClick(View v) {
                       Intent intent = new Intent(LoginActivity.this, RegistrationActivity.class);
                       startActivity(intent);
                          }
                                               }

        );

    }
}