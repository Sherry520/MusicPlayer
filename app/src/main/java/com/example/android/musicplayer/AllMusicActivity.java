package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AllMusicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_music);

        Button playingButton = (Button) findViewById(R.id.playingButton);
        playingButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent playingIntent = new Intent(AllMusicActivity.this,PlayingActivity.class);
                startActivity(playingIntent);
            }
        });
    }
}
