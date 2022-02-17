package com.mrmindteam.syriancards.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.mrmindteam.syriancards.R;
import com.mrmindteam.syriancards.SpinnerCustom.CustomSpinnerAdapter;
import com.mrmindteam.syriancards.SpinnerCustom.CustomSpinnerItem;
import com.mrmindteam.syriancards.utils.CustomToast;

import java.util.ArrayList;

public class SellCardActivity extends AppCompatActivity {

    Spinner cardsSpinner, valueSpinner;
    String selectedCard, selectedValue;
    CustomSpinnerAdapter customSpinnerAdapter;
    private ArrayList<CustomSpinnerItem> cardsSpinnerList;
    private ArrayList<CustomSpinnerItem> valuesSpinnerList;
    ImageButton increment, decrement;
    TextView quantityTV;
    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_card);

        increment = findViewById(R.id.quantity_increment);
        decrement = findViewById(R.id.quantity_decrement);

        cardsSpinner = findViewById(R.id.cards_spinner);
        valueSpinner = findViewById(R.id.card_value_spinner);

        quantityTV = findViewById(R.id.quantity);
        initCardsSpinnerList();
        initValuesSpinnerList();

        customSpinnerAdapter = new CustomSpinnerAdapter(getApplicationContext(), cardsSpinnerList);

        cardsSpinner.setAdapter(customSpinnerAdapter);
        valueSpinner.setAdapter(customSpinnerAdapter);

        selectedCard = cardsSpinnerList.get(0).getCardName();
        selectedValue = valuesSpinnerList.get(0).getCardName();

        cardsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedCard = cardsSpinnerList.get(position).getCardName();
                Log.e("selected cat", selectedCard);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        valueSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                selectedValue = valuesSpinnerList.get(position).getCardName();
                Log.e("selected cat", selectedValue);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        increment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quantity += 1;
                quantityTV.setText(String.valueOf(quantity));
                CustomToast.showLongToast(String.valueOf(quantity), SellCardActivity.this);

            }
        });

        decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(quantity > 0){
                    quantity -= 1;
                }
                quantityTV.setText(String.valueOf(quantity));
                Toast.makeText(SellCardActivity.this, String.valueOf(quantity), Toast.LENGTH_SHORT).show();
            }
        });
    }


    //Initializing of custom spinner
    private void initCardsSpinnerList() {
        cardsSpinnerList = new ArrayList<CustomSpinnerItem>(){
            {
                add(new CustomSpinnerItem("google"));
                add(new CustomSpinnerItem("amazon"));
            }
        };
    }

    private void initValuesSpinnerList() {
        valuesSpinnerList = new ArrayList<CustomSpinnerItem>(){
            {
                add(new CustomSpinnerItem("100"));
                add(new CustomSpinnerItem("200"));
            }
        };
    }
}