package com.example.fairception;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CreateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create1);
        getSupportActionBar().hide();

//        Toolbar toolbar = findViewById(R.id.my_toolbarcreate1);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("Create Account");
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_ios_24);




        Button button_next_createactivity1 = (Button)findViewById(R.id.button_Letsgo_CreateActivity);
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
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}


