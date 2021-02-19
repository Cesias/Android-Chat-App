package com.example.cassavachat;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    TextView login_link;
    Button register_button;

    EditText fullname,password,email,confirm_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        login_link = findViewById(R.id.login_link);
        register_button = findViewById(R.id.register_button);

        fullname = (EditText)findViewById(R.id.full_name);
        email = (EditText)findViewById(R.id.email);
        password = (EditText)findViewById(R.id.password);
        confirm_password = (EditText)findViewById(R.id.confirm_password);

        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fullname_txt = fullname.getText().toString();
                String email_txt = email.getText().toString();
                String password_txt = password.getText().toString();
                String confirm_password_txt = confirm_password.getText().toString();



                if (isValidEmail(email_txt) == true && isNotEmptyPassword(password_txt) && isPasswordMatched(password_txt,confirm_password_txt) && isValidFullname(fullname_txt)){
                    Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                    startActivity(intent);
                }else if(isValidFullname(fullname_txt) != true) {
                    Toast.makeText(getApplicationContext(), "Fullname is empty", Toast.LENGTH_LONG).show();
                }else if(isPasswordMatched(password_txt,confirm_password_txt) != true){
                    Toast.makeText(getApplicationContext(), "Passwords do not match", Toast.LENGTH_LONG).show();
                }else if(isValidEmail(email_txt) != true){
                    Toast.makeText(getApplicationContext(), "Email not valid", Toast.LENGTH_LONG).show();
                }else if(isNotEmptyEmail(email_txt) != true){
                    Toast.makeText(getApplicationContext(), "Email is empty", Toast.LENGTH_LONG).show();
                }

            }
        });
        login_link.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RegistrationActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });



    }

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }
    public static boolean isValidFullname(String fullname) {
        return (!TextUtils.isEmpty(fullname) );
    }
    public static boolean isNotEmptyPassword(String password) {
        return (!TextUtils.isEmpty(password) );
    }
    public static boolean isNotEmptyEmail(String email) {
        return (!TextUtils.isEmpty(email) );
    }
    public static boolean isPasswordMatched(String password,String confirm_password) {
        boolean hasMatched = false;
            if(password.equals(confirm_password)){
                hasMatched = true;
            }else{
                hasMatched = false;
            }
            return hasMatched;
    }
    public static boolean checkall(String password) {
        return (!TextUtils.isEmpty(password) );
    }


}