package com.practice.example_lec_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;//TextView나 뭐 이런것들 사용할때의 코딩 틀
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText et_test;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //앱이 싫행될때 처음 실행되는 부분
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_test = findViewById(R.id.et_test);

        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Sub로 이동하는게 목적이다.

                str = et_test.getText().toString();

                Intent intent = new Intent(MainActivity.this, SubActivity.class);
                //처음 인자에는 현재 액티비티 두번째 인자에는 이동할 액티비티
                intent.putExtra("str", str);
                //다음 엑티비티에서 별명 "str을 통해서 값을 받아와야 한다."

                startActivity(intent);
            }
        });

    }
}