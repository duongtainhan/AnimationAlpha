package com.example.duongtainhan555.animationalpha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imgAlpha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Anh xa
        Init();
        //
        final Animation animAlpha = AnimationUtils.loadAnimation(this, R.anim.anim_alpha);
        //Click event
        imgAlpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                view.startAnimation(animAlpha);
            }
        });
    }

    private void Init()
    {
        imgAlpha = findViewById(R.id.imgAlpha);
    }
}
