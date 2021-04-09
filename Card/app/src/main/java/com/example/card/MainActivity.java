package com.example.card;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText data;
    private Button send;
    private WebView image;
    private MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = findViewById(R.id.data);
        send = findViewById(R.id.send);
        image = findViewById(R.id.image);
        mp = MediaPlayer.create(this, R.raw.runner);
        mp.start();

        WebSettings gif = image.getSettings();
        gif.setJavaScriptEnabled(true);

        String path = "file:android_asset/thenum.gif";
        image.loadUrl(path);

        send.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View V){
                Intent a = new Intent(MainActivity.this, Option.class);
                a.putExtra("Dados", data.getText().toString());
                startActivity(a);
            }
        });

    }
}