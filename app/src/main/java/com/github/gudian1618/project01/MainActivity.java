package com.github.gudian1618.project01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // R代表的res文件夹,R类是android自动生成的
        // 以前java是通过文件夹来访问一个文件
        /**
         * android为了提高文件访问速度,把文件压缩到一个文件中了
         * 程序变小了,访问速度也提高了
         */
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.view2);
//        // 找到textView
//        // 跟js中的document.getElementById()一样
//        TextView textView = (TextView) findViewById(R.id.login);
//        // 完成事件绑定
//        TextViewListener listener = new TextViewListener();
//        textView.setOnClickListener(listener);

    }

//    // 内部类
//    class TextViewListener implements View.OnClickListener {
//
//        @Override
//        public void onClick(View view) {
//            // js用alert
//            // 微信小程序用wx.showTools
//            Toast toast = Toast.makeText(MainActivity.this, "你好", Toast.LENGTH_LONG);
//            toast.show();
//        }
//    }

}