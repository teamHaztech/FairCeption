package com.example.fairception;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

import androidx.appcompat.widget.Toolbar;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.fairception.databinding.TransferableSkillBinding;

public class TransferableSkillActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transferable_skill);
        Toolbar toolbar = findViewById(R.id.my_toolbarTransfer);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Transferable Skills");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_ios_24);



        Button btConfirm = (findViewById(R.id.btnNextHardskill2));

        btConfirm.setOnClickListener(view -> {
            Intent i = new Intent(TransferableSkillActivity.this,MyAspirationActivity.class);
            startActivity(i);
            finish();

        });


    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_transferable_skill);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}