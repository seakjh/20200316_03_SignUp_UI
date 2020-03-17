package com.example.a20200316_03_signup_ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
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

    }
}
