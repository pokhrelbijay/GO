package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private Button Home;
    private Button Office;
    private Button None;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Home=(Button)findViewById(R.id.bHome);
        Office=(Button)findViewById(R.id.bOffice);
        None=(Button)findViewById(R.id.bNone);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterHome();
            }
        });
        Office.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterOffice();
            }
        });
        None.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enterNone();
            }
        });
    }

    private void enterHome(){
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);
    }
    private void enterOffice(){
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);
    }
    private void enterNone(){
        Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
        startActivity(intent);
    }

}
