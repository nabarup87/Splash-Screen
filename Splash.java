package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
       //step 1
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //step 2
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);
                //step 3
                finish();
            }
        },4000);
    }
}
