package com.mrmindteam.syriancards.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mrmindteam.syriancards.R;
import com.mrmindteam.syriancards.utils.Validation;

public class SignUpActivity extends AppCompatActivity {
    private Button btnLogin,btnSignup;
    private Button signUpBtn;
    EditText phoneET, nameET, passwordET, confirmPasswordET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnLogin=(Button)findViewById(R.id.btnLogin);
        btnSignup=(Button)findViewById(R.id.btnSignup);

        phoneET = findViewById(R.id.phone_et);
        nameET = findViewById(R.id.name_et);
        passwordET = findViewById(R.id.password_et);
        confirmPasswordET = findViewById(R.id.confirm_password_et);
        signUpBtn = findViewById(R.id.signup);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });


        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Validation.validateInput(getApplicationContext(), phoneET, nameET, passwordET, confirmPasswordET)){
                    if(Validation.validatePasswordConfirmation(getApplicationContext(), passwordET, confirmPasswordET) &&
                            Validation.validatePhoneNumber(getApplicationContext(), phoneET)){
                        signUp();
                    }
                }
            }
        });



    }

    private void signUp() {
        String name = nameET.getText().toString().trim();
        String phone = phoneET.getText().toString().trim();
        String password = passwordET.getText().toString().trim();
        String confirmPass = confirmPasswordET.getText().toString().trim();

    }
}