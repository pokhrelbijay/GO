package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {
    private EditText Email;
    private EditText Password;
    private Button SignIn;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Email = (EditText)findViewById(R.id.etEmail);
         Password = (EditText)findViewById(R.id.etPassword);
         SignIn = (Button)findViewById(R.id.bSignIn);

         SignIn.setOnClickListener(new View.OnClickListener() {
             @Override
                public void onClick(View v) {
                    validate(Email.getText().toString(), Password.getText().toString());

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
}
