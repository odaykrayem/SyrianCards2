package com.mrmindteam.syriancards.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;

import com.mrmindteam.syriancards.Constants;
import com.mrmindteam.syriancards.R;

public class RequestBalanceActivity extends AppCompatActivity {

    RadioGroup mTransferOptions;
    TextView mAmountTv;
    SeekBar mAmountSeekBar;
    Button mSubmitRequestBtn;

    int selectedOption = Constants.TRANSFER_OPTION_ALHARAM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_balance);

        bindViews();

        mTransferOptions.check(R.id.haram);

        mTransferOptions.setOnCheckedChangeListener((group, checkedId) -> {
            switch (checkedId){
                case R.id.haram:
                    selectedOption = Constants.TRANSFER_OPTION_ALHARAM;
                    break;
                case R.id.fouad:
                    selectedOption = Constants.TRANSFER_OPTION_ALFOUAD;
                    break;
            }
        });

        mAmountTv.setText(String.valueOf(100034));
        mAmountSeekBar.setMax(100034);
        mAmountSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                mAmountTv.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    private void bindViews() {
        mTransferOptions = findViewById(R.id.options);
        mAmountSeekBar = findViewById(R.id.amount_seekbar);
        mAmountTv = findViewById(R.id.amount);
        mSubmitRequestBtn = findViewById(R.id.submit);
    }
}