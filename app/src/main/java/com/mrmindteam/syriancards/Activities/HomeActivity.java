package com.mrmindteam.syriancards.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.mrmindteam.syriancards.R;

import jp.wasabeef.blurry.Blurry;

public class HomeActivity extends AppCompatActivity {

    CardView card1;
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        frameLayout = findViewById(R.id.frame);
        Blurry.with(this)
                .sampling(8)
                .color(Color.argb(66, 255, 255, 0))
                .async()
                .onto(frameLayout);
    }
}