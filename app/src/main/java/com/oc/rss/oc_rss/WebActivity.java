package com.oc.rss.oc_rss;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

/* Class that manages activity_web layout.
 */
public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        //The intent is retrieved if there
        Intent intent = getIntent();
        if (intent != null) {
            //We change the title of the navigation bar
            setTitle(intent.getStringExtra("title"));
            //If there is a WebView with the right id, we put htmlContent
            WebView webView = (WebView) findViewById(R.id.webView);
            if (webView != null) {
                webView.loadData(intent.getStringExtra("htmlContent"), "text/html; charset=UTF-8", null);
            }
        }
    }
}
