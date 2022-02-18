package com.mrmindteam.syriancards.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mrmindteam.syriancards.R;
import com.mrmindteam.syriancards.utils.Validation;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin, btnSignUp;

    EditText phoneET, passET;
    Button loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin=(Button)findViewById(R.id.btnLogin);
        btnSignUp=(Button)findViewById(R.id.btnSignup);

        phoneET = findViewById(R.id.phone_et);
        passET = findViewById(R.id.password_et);
        loginBtn = findViewById(R.id.login);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Validation.validateInput(getApplicationContext(), phoneET, passET)){
                    if(Validation.validatePhoneNumber(getApplicationContext(), phoneET)){
                        login();
                    }
                }
            }
        });
    }

    private void login() {
        String phone = phoneET.getText().toString().trim();
        String pass = passET.getText().toString().trim();
    }
}