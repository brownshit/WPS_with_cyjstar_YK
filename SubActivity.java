package com.practice.example_lec_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    private TextView tv_sub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        tv_sub = findViewById(R.id.tv_sub);

        Intent intent = getIntent();
        //어디서든 intent로 어디서든 데이터가 날아오게 되면 받겠다. getIntent
        String str = intent.getStringExtra("str");//별명 Main에서 가져오기

        tv_sub.setText(str);
    }
}