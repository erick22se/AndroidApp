package com.example.soldaplication;

import android.content.Intent;
import android.os.Handler;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class LoadingActivity extends AppCompatActivity {
    Thread splashTread;
    private ImageView ic_img;
    private static int timer = 4000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        startAnimation();
    }

    private void startAnimation()
    {

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.alpha);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = (ImageView) findViewById(R.id.ic_sold);
        iv.clearAnimation();
        iv.startAnimation(anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent login= new Intent(LoadingActivity.this,LoginActivity.class);
                startActivity(login);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                finish();

            }
        }, timer);


    }
}
