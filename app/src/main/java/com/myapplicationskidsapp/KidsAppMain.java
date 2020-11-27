package com.myapplicationskidsapp;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.media.MediaPlayer;


public class KidsAppMain extends AppCompatActivity{

    Button playButton;
    Button pauseButton;

    MediaPlayer playMediaPlayer;
    MediaPlayer pauseMediaPlayer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        playButton = findViewById(R.id.playButton_id);
        pauseButton = findViewById(R.id.pauseButton_id);

        playButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(playMediaPlayer != null)
                    playMediaPlayer.reset();

                    playMediaPlayer = MediaPlayer.create(KidsAppMain.this, R.raw.ketsa01_dreaming_days);
                    playMediaPlayer.start();
            }
        });

        pauseButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                playMediaPlayer.pause();
            }
        });
    }
}