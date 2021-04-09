package com.example.card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class Option extends AppCompatActivity {
    private TextView answer;
    private Button btnTeaser, btnAudio;
    private WebView images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option);

        answer = findViewById(R.id.answer);
        btnTeaser = findViewById(R.id.btnTeaser);
        btnAudio = findViewById(R.id.btnAudio);
        images = findViewById(R.id.images);

        String receive = getIntent().getStringExtra("Dados");

        WebSettings gif = images.getSettings();
        gif.setJavaScriptEnabled(true);
        String path = "file:android_asset/terror.gif";
        images.loadUrl(path);

        btnTeaser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runTeaser();


            }
        });
        btnAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runAudio();
            }
        });
    }

    public void runTeaser() {
        Intent janelat = new Intent(this, Teaser.class);
        startActivity(janelat);
    }

    public void runAudio() {
        Intent janelas = new Intent(this, Music.class);
        startActivity(janelas);
    }
}
