package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private Button SignIn;
    private int counter = 5;
    private TextView SignUp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Email = (EditText)findViewById(R.id.etEmail);
         Password = (EditText)findViewById(R.id.etPassword);
         SignIn = (Button)findViewById(R.id.SignUp);
         SignUp = (TextView) findViewById(R.id.signup);

         SignIn.setOnClickListener(new View.OnClickListener() {
             @Override
                public void onClick(View v) {
                    validate(Email.getText().toString(), Password.getText().toString());

                }
            });
            SignUp.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    createAccount();

                }
        });


    }



    private void validate(String userName, String userPassword){
        if((userName.equals("Admin") ) && (userPassword.equals("1234"))){
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        else{
            counter--;
            if(counter == 0){
                SignIn.setEnabled(false);
            }
        }
    }

    private void createAccount(){
            Intent intent = new Intent(MainActivity.this, SignUp.class);
            startActivity(intent);
    }
}
