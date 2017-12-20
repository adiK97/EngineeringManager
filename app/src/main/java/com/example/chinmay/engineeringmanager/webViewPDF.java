package com.example.chinmay.engineeringmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class webViewPDF extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_pdf);
        final WebView webView;

        webView = (WebView) findViewById(R.id.webviewPDFarea);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://drive.google.com/open?id=0Bz9C0ysJZ7PnaWJQLTduVWIyYnM");

    }
}
