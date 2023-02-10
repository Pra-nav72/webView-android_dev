package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wv = (WebView) findViewById(R.id.webView);
        WebViewSetUp(wv);

    }
    
    private void WebViewSetUp(WebView webv){

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            webv.getWebViewClient();

            webv.getSettings().setJavaScriptEnabled(true);
            webv.getSettings().setSafeBrowsingEnabled(true);
            webv.loadUrl("youtube.com");

        }
    }
}