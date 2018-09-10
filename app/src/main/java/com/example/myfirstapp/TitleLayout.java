package com.example.myfirstapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by lenovo on 2018/8/13.
 */

public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context,AttributeSet atters){
        super(context,atters);
        LayoutInflater.from(context).inflate(R.layout.title,this);
    }
}


