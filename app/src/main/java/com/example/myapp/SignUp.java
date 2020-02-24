package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    private EditText FullName;
    private EditText Email;
    private EditText Password;
    private EditText ConfirmPassword;
    private Button SignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        FullName = (EditText)findViewById(R.id.fullname);
        Email = (EditText)findViewById(R.id.etEmail);
        Password = (EditText)findViewById(R.id.etPassword);
        ConfirmPassword = (EditText)findViewById(R.id.ConfirmPassword);
        SignUp = (Button)findViewById(R.id.SignUp);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate();

            }


        });

    }

    private void validate(){

            Intent intent = new Intent(SignUp.this, SecondActivity.class);
            startActivity(intent);

    }
}
