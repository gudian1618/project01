package com.github.gudian1618.project01;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    /**
     * 系统调用的方法onCreate,conCLick,必须加try-catch代码,否则出现异常,进程就结束了,程序退出.
     * 有异常处理,即使有异常,程序还能正常进行别的操作,不会中断退出崩溃
     * @param savedInstanceState
     */

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
//        setContentView(R.layout.view1);
        // 找到webview,加载服务器上的响应页面
        setContentView(R.layout.webview);
        WebView webView = (WebView) findViewById(R.id.webview);
        webView.clearCache(true);
//        webView.loadUrl("http://localhost:8096/CGB_DB_SYS_V3_01_war/doIndexUI.do");
        webView.loadUrl("https://www.jd.com");
        // 设置允许执行js
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // 单击超连接跳出app
        webView.setWebViewClient(new WebViewClient());

//        // 找到textView
//        // 跟js中的document.getElementById()一样
//        TextView textView = (TextView) findViewById(R.id.login);
//        // 完成事件绑定
//        TextViewListener listener = new TextViewListener();
//        textView.setOnClickListener(listener);

//        Button btn = (Button) findViewById(R.id.btn1);
//        BtnListener listener = new BtnListener();
//        btn.setOnClickListener(listener);

    }

//    // 练习点击按钮内部类
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

//    class BtnListener implements View.OnClickListener {
//
//        @Override
//        public void onClick(View view) {
//            try {
//                Toast toast = Toast.makeText(MainActivity.this, "你好", Toast.LENGTH_LONG);
////                toast = null;
//                toast.show();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }

}