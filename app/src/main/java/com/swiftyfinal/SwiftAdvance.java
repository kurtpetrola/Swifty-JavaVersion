package com.swiftyfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class SwiftAdvance extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swift_advance);
        getSupportActionBar().setTitle("Swift Advance");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView web;
        web = findViewById(R.id.swiftAdvanceWV);
        web.loadUrl("file:///android_asset/swiftAdvance.html");
    }
}