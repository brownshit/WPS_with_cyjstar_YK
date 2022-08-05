package com.practice.wpsactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button bt_1; private Button bt_2;

    Button bt_test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //어플 처음실행할때 실행되는 부분
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_1 = findViewById(R.id.bt_1);
        bt_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity1.class);
                startActivity(intent);//엑티비티 이동
            }
        });

        bt_2 = findViewById(R.id.bt_2);
        bt_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SubActivity2.class);
                startActivity(intent);
            }
        });


    }
}