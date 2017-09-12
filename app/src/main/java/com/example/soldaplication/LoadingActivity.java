package com.example.soldaplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class LoadingActivity extends AppCompatActivity {

    private ImageView ic_img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        ic_img = (ImageView) findViewById(R.id.ic_sold);
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.loading_tran);
        ic_img.startAnimation(anim);
        final Intent login = new Intent(this,LoginActivity.class);
        Thread timer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch(InterruptedException e)
                {
                    e.printStackTrace();

                }finally {
                    startActivity(login);
                    finish();

                }


            }
        };

                timer.start();
    }
}
