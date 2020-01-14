package com.example.myesp8266;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(
                new Runnable() {
                    @Override
                    public void run() {
                        //create an intent to run the MainActivity
                        Intent intent = new Intent(Splash.this, MainActivity.class);
                        Splash.this.startActivity(intent);
                        Splash.this.finish();
                    }
                }, SPLASH_DISPLAY_LENGTH
        );
    }
}
