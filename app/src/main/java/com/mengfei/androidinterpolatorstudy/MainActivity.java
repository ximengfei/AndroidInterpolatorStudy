package com.mengfei.androidinterpolatorstudy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tv = (TextView) findViewById(R.id.tv);
        Button normal = (Button) findViewById(R.id.normal);
        Button spring = (Button) findViewById(R.id.spring);
        final TranslateAnimation ta = new TranslateAnimation(0, 0, 0, 500);
        ta.setDuration(3000);
        ta.setFillAfter(true);

        normal.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                ta.setInterpolator(new LinearInterpolator());
                tv.startAnimation(ta);
            }
        });
        spring.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                ta.setInterpolator(new SpringInterpolator());
                tv.startAnimation(ta);
            }
        });

    }
}
