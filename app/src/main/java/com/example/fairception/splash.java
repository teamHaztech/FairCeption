package com.example.fairception;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);*/
        setContentView(R.layout.splashscreen);
        getSupportActionBar().hide();

        Thread thread = new Thread(){
            @Override
            public void run() {
                super.run();
                try {
                    sleep(1500);
                }
                catch(Exception e){
                    e.printStackTrace();
                }
                finally {
                    Intent i = new Intent(splash.this,WelcomeActivity.class);
                    startActivity(i);
                    finish();

                }
            }
        };

        thread.start();


    }
}