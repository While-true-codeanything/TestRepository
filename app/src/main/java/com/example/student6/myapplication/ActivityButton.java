package com.example.student6.myapplication;

import android.view.View;
import android.widget.TextView;
import android.widget.TextView;

public class ActivityButton implements View.OnClickListener {

    private TextView textViev;
    private int Flag=1;
    public ActivityButton(TextView tv){
        this.textViev=tv;
    }

    public void onClick(View v){
        if(Flag==1) {
            textViev.setText("ф");
            Flag = 2;
        }else {if(Flag==2) {
            textViev.setText("с");
            Flag = 3;
        }else {
            if(Flag==3) {
                textViev.setText("а");
                Flag = 4;
            }else {
                textViev.setText("п");
                Flag = 1;
            }
        }
        }
    }

}
