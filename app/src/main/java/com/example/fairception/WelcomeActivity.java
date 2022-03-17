package com.example.fairception;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

      Button  button_CreateAnaccount1=findViewById(R.id.button_CreateAnAccount_welcomeActivity);
      Button button_Signin_WelcomeActivity2=findViewById(R.id.button_Signin_WelcomeActivity);

      button_Signin_WelcomeActivity2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent n =new Intent(WelcomeActivity.this,SigninActivity.class);
              startActivity(n);
          }
      });
      button_CreateAnaccount1.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View view) {
              Log.d("test", "index=" );

              Intent o = new Intent(WelcomeActivity.this,CreateActivity.class);
              startActivity(o);

             }
      });

    }
}