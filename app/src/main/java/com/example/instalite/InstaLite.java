package com.example.instalite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class InstaLite extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insta_lite);
        web = (WebView) findViewById(R.id.web);
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.loadUrl("https://www.instagram.com/");
        web.setWebViewClient(new WebViewClient());

    }

    @Override
    public void onBackPressed() {
        web.goBack();
    }
}