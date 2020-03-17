package com.example.a20200316_03_signup_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button loginBtn = null;
    TextView findPwtxt = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn = findViewById(R.id.loginBtn);
//        로그인 버튼의 글자를 회원가입으로 바꿈
        loginBtn.setText("회원가입");

//        비밀번호 찾기를 비번 찾기로 바꾸어보자
//        id는 findPwtxt
        findPwtxt = findViewById(R.id.findPwtxt);
        findPwtxt.setText("비번 찾기");

//       로그인버튼이 눌리면 => 비번찾기 버튼을 aaa로 변경

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                findPwtxt.setText("aaa");

            }
        });

//        클릭은 버튼뿐 아니라 모든 뷰가 다 눌릴 수 있다. => 텍스트 뷰도 클릭 가능.

        findPwtxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findPwtxt.setText("비밀번호 찾기");
            }
        });

        loginBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                loginBtn.setText("로그인");
                return true;   // 손을 뗏을때 OnClick 실행을 막을건데?:true, 막지않을거야:false
            }
        });

    }
}
