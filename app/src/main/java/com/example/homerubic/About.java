package com.example.homerubic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class About extends AppCompatActivity {

    //private Button button;
    private ImageView cube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about2);

        cube = (ImageView) findViewById(R.id.cube);
        cube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animation = AnimationUtils.loadAnimation(About.this, R.anim.rotate);
                cube.startAnimation(animation);
            }
        });


    }
}