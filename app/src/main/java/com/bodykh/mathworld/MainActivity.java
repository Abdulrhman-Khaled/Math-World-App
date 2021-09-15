package com.bodykh.mathworld;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    ImageView applogo, bklogo;
    TextView title;
    Animation topAnim, bottomAnim, leftAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_main);
        applogo = findViewById(R.id.applogo);
        bklogo = findViewById(R.id.bklogo);
        title = findViewById(R.id.mathworldtit);
        //Animations
        topAnim = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        leftAnim = AnimationUtils.loadAnimation(this, R.anim.left_animation);
        //Set animation to elements
        applogo.setAnimation(topAnim);
        bklogo.setAnimation(bottomAnim);
        title.setAnimation(leftAnim);
        int splash_screen = 2000;
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(MainActivity.this, homepage.class);
            startActivity(intent);
            finish();
        }, splash_screen);
    }
}