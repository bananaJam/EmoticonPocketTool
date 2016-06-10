package com.example.shrey.emoticon;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.VideoView;

public class Manual extends AppCompatActivity {
    Button firstButton;
    Button secondButton;
    Button thirdButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manual);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        firstButton = (Button) findViewById(R.id.button2);
        secondButton = (Button) findViewById(R.id.button3);
        thirdButton = (Button) findViewById(R.id.button4);
        final VideoView video = (VideoView) findViewById(R.id.videoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.sample;
        video.setVideoURI(Uri.parse(path));
       firstButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               video.start();
           }
       });

        //repeated each time for different mode tutorials, didn't have other vids so used the same one as example

        final VideoView video = (VideoView) findViewById(R.id.videoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.sample;
        video.setVideoURI(Uri.parse(path));

        secondButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video.start();
            }
        });

        final VideoView video = (VideoView) findViewById(R.id.videoView);
        String path = "android.resource://" + getPackageName() + "/" + R.raw.sample;
        video.setVideoURI(Uri.parse(path));
        thirdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                video.start();
            }
        });

    }
}