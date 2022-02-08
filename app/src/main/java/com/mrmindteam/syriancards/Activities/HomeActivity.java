package com.mrmindteam.syriancards.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.mrmindteam.syriancards.R;


public class HomeActivity extends AppCompatActivity {

    CardView card1;
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

    }
}