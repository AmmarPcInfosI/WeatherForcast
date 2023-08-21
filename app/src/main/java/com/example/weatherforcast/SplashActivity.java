package com.example.weatherforcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        final ImageView logoImageView = findViewById(R.id.logoImageView);

        Animation fadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fadeInAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                // Make the logo visible before the fade-in animation starts
                logoImageView.setVisibility(View.VISIBLE);
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // Start the delay before the fade-out animation
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        startFadeOutAnimation();
                    }
                }, 8000); // 8 seconds delay before fade-out animation starts
            }

            @Override
            public void onAnimationRepeat(Animation animation) {}
        });

        logoImageView.startAnimation(fadeInAnimation);
    }

    private void startFadeOutAnimation() {
        final ImageView logoImageView = findViewById(R.id.logoImageView);
        Animation fadeOutAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        fadeOutAnimation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {}

            @Override
            public void onAnimationEnd(Animation animation) {
                // Hide the logo and start the main activity
                logoImageView.setVisibility(View.INVISIBLE);
                startMainActivity();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {}
        });

        logoImageView.startAnimation(fadeOutAnimation);
    }

    private void startMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}


