package com.mrmindteam.syriancards.utils;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

import com.mrmindteam.syriancards.R;


public class Validation {

    public static boolean validateInput(Context ctx, EditText...fields){
        for (EditText editText: fields) {
            if (editText.getText().toString().trim().isEmpty()){
                Toast.makeText(ctx, ctx.getResources().getString(R.string.missing_fields_message), Toast.LENGTH_SHORT).show();
                return false;
            }
        }
        return true;
    }
    public static boolean validatePasswordConfirmation(Context ctx, EditText pass, EditText confirmPass){

            if (!pass.getText().toString().trim().equals(confirmPass.getText().toString().trim())){
                Toast.makeText(ctx, ctx.getResources().getString(R.string.confirm_pass_error), Toast.LENGTH_SHORT).show();
                return false;
            }

        return true;
    }

    public static boolean validatePhoneNumber(Context ctx, EditText phone){

        if (phone.getText().toString().trim().length() < 10){
            Toast.makeText(ctx, ctx.getResources().getString(R.string.phone_length_error), Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }
}