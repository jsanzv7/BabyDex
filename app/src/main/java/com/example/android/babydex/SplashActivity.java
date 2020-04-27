package com.example.android.babydex;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private TextView appTitle;
    private AlphaAnimation fadeOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        fadeOut = new AlphaAnimation(0.0f, 1.0f);
        appTitle = (TextView) findViewById(R.id.babydex_title_textView);

        appTitle.startAnimation(fadeOut);
        fadeOut.setDuration(2000);
        fadeOut.setFillAfter(true);


        //duration, interval
        new CountDownTimer(3000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {

            }

            @Override
            public void onFinish() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        }.start();

    }
}
