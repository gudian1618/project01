package com.github.gudian1618.project01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // R代表的res文件夹,R类是android自动生成的
        setContentView(R.layout.activity_main);
    }
}