package com.swiftyfinal;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.os.Bundle;

public class AboutUsInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us_info);
        getSupportActionBar().setTitle("About Us!");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView web;
        web = findViewById(R.id.swiftAboutUsWV);
        web.loadUrl("file:///android_asset/aboutUs.html");
    }
}