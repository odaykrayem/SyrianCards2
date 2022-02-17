package com.mrmindteam.syriancards.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.mrmindteam.syriancards.R;


public class HomeActivity extends AppCompatActivity {

    CardView card1;
    FrameLayout frameLayout;
    FrameLayout sellCard, requestBalance, myOrders, myRequests;
    RecyclerView notificationsRV;
    TextView seeAll;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        sellCard = findViewById(R.id.sell_card);
        requestBalance = findViewById(R.id.withdraw);
        myOrders = findViewById(R.id.my_orders);
        myRequests = findViewById(R.id.my_requests);
        notificationsRV = findViewById(R.id.rv);
        seeAll = findViewById(R.id.see_all);

        sellCard.setOnClickListener(v -> startActivity(
                new Intent(HomeActivity.this, SellCardActivity.class)));

        requestBalance.setOnClickListener(v -> startActivity(
                new Intent(HomeActivity.this, RequestBalanceActivity.class)));

        myOrders.setOnClickListener(v -> startActivity(
                new Intent(HomeActivity.this, MyOrdersActivity.class)));

        myRequests.setOnClickListener(v -> startActivity(
                new Intent(HomeActivity.this, BalanceRequestsActivity.class)));

        seeAll.setOnClickListener(v -> startActivity(
                new Intent(HomeActivity.this, NotificationsListActivity.class)));

    }
}