package com.mrmindteam.syriancards.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.mrmindteam.syriancards.R;


public class HomeActivity extends AppCompatActivity {

    CardView card1;
    FrameLayout frameLayout;
    FrameLayout sellCard, withdraw, myOrders, myRequests;
    RecyclerView notificationsRV;
    TextView seeAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        sellCard = findViewById(R.id.sell_card);
        withdraw = findViewById(R.id.withdraw);
        myOrders = findViewById(R.id.my_orders);
        myRequests = findViewById(R.id.my_requests);
        notificationsRV = findViewById(R.id.rv);
        seeAll = findViewById(R.id.see_all);

        sellCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SellCardActivity.class));
            }
        });
        withdraw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, RequestBalance.class));
            }
        });
        myOrders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, BalanceRequests.class));
            }
        });
        myRequests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SellCardActivity.class));
            }
        });
        sellCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SellCardActivity.class));
            }
        });
        sellCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this, SellCardActivity.class));
            }
        });
    }
}