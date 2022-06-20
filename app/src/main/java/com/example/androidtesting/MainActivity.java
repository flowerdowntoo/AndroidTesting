package com.example.androidtesting;


import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

//弹出一个弹框，通过滑动选择日历日期
public class MainActivity extends AppCompatActivity {

        @SuppressLint("ResourceType")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

    }
}