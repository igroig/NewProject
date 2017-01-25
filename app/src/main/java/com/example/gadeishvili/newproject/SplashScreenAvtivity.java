package com.example.gadeishvili.newproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreenAvtivity extends AppCompatActivity {

    private final int splashTime = 600;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_avtivity);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenAvtivity.this, MainActivity.class));
                finish();
            }
        }, splashTime);
    }
}
