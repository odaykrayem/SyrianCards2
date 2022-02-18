package com.mrmindteam.syriancards.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;

import com.mrmindteam.syriancards.Constants;
import com.mrmindteam.syriancards.R;
import com.mrmindteam.syriancards.adapters.BalanceRequestsAdapter;
import com.mrmindteam.syriancards.adapters.MyOrdersAdapter;
import com.mrmindteam.syriancards.models.Order;
import com.mrmindteam.syriancards.models.Request;

import java.util.ArrayList;

public class MyOrdersActivity extends AppCompatActivity {

    SwipeRefreshLayout mSwipeRefreshLayout;
    RecyclerView rv;
    MyOrdersAdapter adapter;
    ArrayList<Order> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_orders);

        rv = findViewById(R.id.rv_orders);
        list = new ArrayList<Order>(){{
            new Order (1,"google", "25", 2, "12-2-2022", Constants.CARD_STATUS_ACCEPTED);
            new Order (1,"google", "25", 2, "12-2-2022", Constants.CARD_STATUS_ACCEPTED);
            new Order (1,"google", "25", 2, "12-2-2022", Constants.CARD_STATUS_ACCEPTED);
            new Order (1,"google", "25", 2, "12-2-2022", Constants.CARD_STATUS_ACCEPTED);
            new Order (1,"google", "25", 2, "12-2-2022", Constants.CARD_STATUS_ACCEPTED);
        }};
        adapter = new MyOrdersAdapter(getApplicationContext(),list);
        rv.setAdapter(adapter);
//        mSwipeRefreshLayout.setOnRefreshListener(this);
//        mSwipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary,
//                android.R.color.holo_green_dark,
//                android.R.color.holo_orange_dark,
//                android.R.color.holo_blue_dark);
//
//
//        mSwipeRefreshLayout.post(new Runnable() {
//
//            @Override
//            public void run() {
//
//                mSwipeRefreshLayout.setRefreshing(true);
//                 getOrders();
//            }
//        });




    }

    private void getOrders() {
        list = new ArrayList<Order>(){{
            new Order (1,"google", "25", 2, "12-2-2022", Constants.CARD_STATUS_ACCEPTED);
            new Order (1,"google", "25", 2, "12-2-2022", Constants.CARD_STATUS_ACCEPTED);
            new Order (1,"google", "25", 2, "12-2-2022", Constants.CARD_STATUS_ACCEPTED);
            new Order (1,"google", "25", 2, "12-2-2022", Constants.CARD_STATUS_ACCEPTED);
            new Order (1,"google", "25", 2, "12-2-2022", Constants.CARD_STATUS_ACCEPTED);
        }};
        adapter = new MyOrdersAdapter(getApplicationContext(),list);
        rv.setAdapter(adapter);
        mSwipeRefreshLayout.setRefreshing(false);

    }

}