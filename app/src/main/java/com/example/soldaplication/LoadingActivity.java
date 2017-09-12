package com.example.soldaplication;

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
    }
}
