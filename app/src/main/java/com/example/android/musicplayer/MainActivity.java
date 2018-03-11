package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button playing = (Button) findViewById(R.id.playing);

        // Set a click listener on that View
        playing.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, PlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        Button allmusic = (Button) findViewById(R.id.all_music);

        // Set a click listener on that View
        allmusic.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent allmusicIntent = new Intent(MainActivity.this, AllMusicActivity.class);
                startActivity(allmusicIntent);
            }
        });

        Button mylove = (Button) findViewById(R.id.my_love);

        // Set a click listener on that View
        mylove.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent myloveIntent = new Intent(MainActivity.this, MyLoveActivity.class);
                startActivity(myloveIntent);
            }
        });

        Button zuijinplay = (Button) findViewById(R.id.zuijinplay);

        // Set a click listener on that View
        zuijinplay.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent zuijinplayIntent = new Intent(MainActivity.this, ZuijinbofangActivity.class);
                startActivity(zuijinplayIntent);
            }
        });

        Button file = (Button) findViewById(R.id.file);

        // Set a click listener on that View
        file.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick(View view) {
                Intent fileIntent = new Intent(MainActivity.this, FileActivity.class);
                startActivity(fileIntent);
            }
        });
    }
}
