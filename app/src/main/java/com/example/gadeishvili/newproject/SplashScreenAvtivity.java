package com.example.gadeishvili.newproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreenAvtivity extends AppCompatActivity {

    private final int splashTime = 1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen_avtivity);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreenAvtivity.this, MainActivity.class));
                SplashScreenAvtivity.this.finish();
            }
        };

        Handler handler = new Handler();
        handler.postDelayed(runnable, splashTime);

    }
}
