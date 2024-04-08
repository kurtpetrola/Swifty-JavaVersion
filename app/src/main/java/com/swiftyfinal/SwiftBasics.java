package com.swiftyfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class SwiftBasics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swift_basics);
        getSupportActionBar().setTitle("Swift Basics");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView web;
        web = findViewById(R.id.swiftBasicsWV);
        web.loadUrl("file:///android_asset/swiftBasics.html");
    }
}