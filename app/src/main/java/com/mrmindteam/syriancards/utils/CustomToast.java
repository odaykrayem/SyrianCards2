package com.mrmindteam.syriancards.utils;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.mrmindteam.syriancards.R;

public class CustomToast {

    public static void showLongToast(String toastMessage,  Activity activity){
        LayoutInflater inflater1 = activity.getLayoutInflater();
        View layout = inflater1.inflate(R.layout.custom_toast,
                (ViewGroup) activity.findViewById(R.id.toast_layout_root));

//        ImageView image = (ImageView) layout.findViewById(R.id.image);
//        image.setImageResource(R.drawable.ic_contest_money);
        TextView textTV =  layout.findViewById(R.id.text);
        textTV.setText(toastMessage);
        Toast toast;
        toast = new Toast(activity);
        toast.setGravity(Gravity.BOTTOM, 0, 100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
    public static void showShortToast(String toastMessage,  Activity activity){
        LayoutInflater inflater1 = activity.getLayoutInflater();
        View layout = inflater1.inflate(R.layout.custom_toast,
                (ViewGroup) activity.findViewById(R.id.toast_layout_root));

//        ImageView image = (ImageView) layout.findViewById(R.id.image);
//        image.setImageResource(R.drawable.ic_contest_money);
        TextView textTV =  layout.findViewById(R.id.text);
        textTV.setText(toastMessage);
        Toast toast;
        toast = new Toast(activity);
        toast.setGravity(Gravity.BOTTOM, 0, 100);
        toast.setMargin(0f,8f);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
