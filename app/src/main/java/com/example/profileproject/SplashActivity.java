package com.example.profileproject;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    ImageView splashImage;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashImage = findViewById(R.id.imageView);
        progressBar = findViewById(R.id.progressBar);


        splashScreen();
    }

    public void splashScreen() {
        Handler handler = new Handler();
        handler.postDelayed(() -> {
            progressBar.setVisibility(View.VISIBLE);
            startActivity(new Intent(SplashActivity.this, MainActivity.class));
            finish();
        }, 5000);
    }
}

