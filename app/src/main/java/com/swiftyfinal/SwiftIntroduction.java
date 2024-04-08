package com.swiftyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SwiftIntroduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swift_introduction);
        getSupportActionBar().setTitle("Swift Introduction");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView web;
        web = findViewById(R.id.swiftIntroductionWV);
        web.loadUrl("file:///android_asset/swiftIntro.html");
    }
}