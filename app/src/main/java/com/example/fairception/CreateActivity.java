package com.example.fairception;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);


        Button button_next_createactivity1 = findViewById(R.id.button_next_create_activity);
//        if(button_next_createactivity1.getText().length()>1){
//            button_next_createactivity1.setBackgroundColor();
//        }else   (hover effect code)

        button_next_createactivity1.setOnClickListener(new View.OnClickListener(){
           @Override
             public void onClick(View view) {

               Log.d("test", "index=" );
               Intent m = new Intent(CreateActivity.this,CreateActivity2.class);
               startActivity(m);

           }
        }
        );
    }
}