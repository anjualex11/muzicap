package com.example.reboot.muzicap;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer myplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void play(View view)
    {

        myplayer=MediaPlayer.create(this,R.raw.bgm);
        myplayer.start();
    }

    public void stop(View view)
    {
        myplayer.pause();
    }
}
