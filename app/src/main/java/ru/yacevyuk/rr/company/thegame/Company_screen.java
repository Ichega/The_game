package ru.yacevyuk.rr.company.thegame;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import kotlinx.coroutines.Delay;

public class Company_screen extends AppCompatActivity {


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.companyscreen);
        getSupportActionBar().hide();

        final Intent i = new Intent(Company_screen.this, MainActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(i);
                finish();
             }
            }, 1000);
        }
}
