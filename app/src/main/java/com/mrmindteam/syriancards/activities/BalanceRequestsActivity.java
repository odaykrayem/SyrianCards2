package com.mrmindteam.syriancards.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;

import com.mrmindteam.syriancards.Constants;
import com.mrmindteam.syriancards.R;
import com.mrmindteam.syriancards.adapters.BalanceRequestsAdapter;
import com.mrmindteam.syriancards.models.Request;

import java.util.ArrayList;

public class BalanceRequestsActivity extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{


    SwipeRefreshLayout mSwipeRefreshLayout;
    RecyclerView rv;
    BalanceRequestsAdapter adapter;
    ArrayList<Request> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balance_requests);

        rv = findViewById(R.id.rv_requests);
        mSwipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe);
        list = new ArrayList<Request>(){{
            new Request(1, "mesage", 3400, Constants.BALANCE_REQUEST_STATUS_DONE, 1,"12-2-2022");
            new Request(1, "mesage", 3400, Constants.BALANCE_REQUEST_STATUS_DONE, 1,"12-2-2022");
            new Request(1, "mesage", 3400, Constants.BALANCE_REQUEST_STATUS_DONE, 1,"12-2-2022");
            new Request(1, "mesage", 3400, Constants.BALANCE_REQUEST_STATUS_DONE, 1,"12-2-2022");
            new Request(1, "mesage", 3400, Constants.BALANCE_REQUEST_STATUS_DONE, 1,"12-2-2022");


        }};
        adapter = new BalanceRequestsAdapter(getApplicationContext(),list);
        rv.setAdapter(adapter);
//        getRequests();

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
//                getRequests();
//
//            }
//        });



    }

    private void getRequests() {

        mSwipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void onRefresh() {
       getRequests();


    }
}