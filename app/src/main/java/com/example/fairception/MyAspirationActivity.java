package com.example.fairception;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MyAspirationActivity extends AppCompatActivity implements View.OnClickListener {
int countHome = 0;
    Button btHome,btOffice, btworkIn,btworkout,bttravel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.aspiration);
        btHome = findViewById(R.id.bthome);
        btOffice = findViewById(R.id.btOffice);
        btworkIn = findViewById(R.id.btWorkIn);
        btworkout= findViewById(R.id.btWorkOut);
        bttravel= findViewById(R.id.btTravel);




        bttravel.setOnClickListener(this);
        btworkout.setOnClickListener(this);
        btworkIn.setOnClickListener(this);
        btOffice.setOnClickListener(this);
        btHome.setOnClickListener(this);

    }



    @Override
    public void onClick(View view) {
        Log.w("PEF", "on Click General");
        switch (view.getId()) {
            case R.id.bthome:
                countHome++;
                if(countHome > 5){
                    countHome=0;

                }
                btHome.setText(String.valueOf(countHome));

                Log.e("aaa",":"+countHome);

                break;
            case R.id.btOffice:
                countHome++;
                if(countHome > 5){
                    countHome=0;

                }
                btOffice.setText(String.valueOf(countHome));

                Log.e("aaa",":"+countHome);

                break;

            case R.id.btWorkIn:
                countHome++;
                if(countHome > 5){
                    countHome=0;

                }
                btworkIn.setText(String.valueOf(countHome));

                Log.e("aaa",":"+countHome);

                break;

            case R.id.btWorkOut:
                countHome++;
                if(countHome > 5){
                    countHome=0;

                }
                btworkout.setText(String.valueOf(countHome));

                Log.e("aaa",":"+countHome);

                break;

            case R.id.btTravel:
                countHome++;
                if(countHome > 5){
                    countHome=0;

                }
                bttravel.setText(String.valueOf(countHome));

                Log.e("aaa",":"+countHome);

                break;
        }
    }
}