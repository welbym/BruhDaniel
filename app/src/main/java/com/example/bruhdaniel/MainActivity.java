package com.example.bruhdaniel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "Main Activity";
    private boolean bruhSet;
    private MediaPlayer mediaPlayer;
    private boolean firstTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout layout = findViewById(R.id.constraintLayout);
        layout.setBackgroundColor(Color.argb(255, 255, 71, 71));

        ImageView bruhImage = findViewById(R.id.bruh);
        ImageView danielImage = findViewById(R.id.daniel);
        ImageView marmotImage = findViewById(R.id.marmot);
        ImageView geniusImage = findViewById(R.id.mathgenius);

        danielImage.setVisibility(View.GONE);
        marmotImage.setVisibility(View.GONE);
        geniusImage.setVisibility(View.GONE);

        // Bruh button red, background red, doesn't start with button
        // Daniel button orange, background orange
        // Marmot button green, background green
        // genius button dark blue, background dark blue
        Button switcher1 = findViewById(R.id.switching_button1);
        switcher1.setBackgroundColor(Color.argb(255, 255, 176, 71));
        Button switcher2 = findViewById(R.id.switching_button2);
        switcher2.setBackgroundColor(Color.argb(255, 71, 255, 71));
        Button switcher3 = findViewById(R.id.switching_button3);
        switcher3.setBackgroundColor(Color.argb(255, 71, 71, 255));

        mediaPlayer = MediaPlayer.create(this, R.raw.bruh_sound);
        mediaPlayer.setOnCompletionListener(mp -> mediaPlayer.release());

        firstTime = true;

        bruhImage.setOnClickListener(View -> {
            if (firstTime) {
                mediaPlayer.release();
                mediaPlayer = MediaPlayer.create(this, R.raw.daniel_sound);
                mediaPlayer.setOnCompletionListener(mp -> mediaPlayer.release());
            }
            Log.d(TAG,"BRUH");
            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.start();
            }
            firstTime = false;
        });
        danielImage.setOnClickListener(View -> {
            if (firstTime) {
                mediaPlayer.release();
                mediaPlayer = MediaPlayer.create(this, R.raw.daniel_sound);
                mediaPlayer.setOnCompletionListener(mp -> mediaPlayer.release());
            }
            Log.d(TAG,"Damn Daniel");
            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.start();
            }
            firstTime = false;
        });
        marmotImage.setOnClickListener(View -> {
            if (firstTime) {
                mediaPlayer.release();
                mediaPlayer = MediaPlayer.create(this, R.raw.marmot);
                mediaPlayer.setOnCompletionListener(mp -> mediaPlayer.release());
            }
            Log.d(TAG,"Damn Daniel");
            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.start();
            }
            firstTime = false;
        });
        geniusImage.setOnClickListener(View -> {
            if (firstTime) {
                mediaPlayer.release();
                mediaPlayer = MediaPlayer.create(this, R.raw.genius);
                mediaPlayer.setOnCompletionListener(mp -> mediaPlayer.release());
            }
            Log.d(TAG,"Damn Daniel");
            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.start();
            }
            firstTime = false;
        });

        switcher1.setOnClickListener(View -> {
            if (bruhSet) {
                bruhImage.setVisibility(android.view.View.GONE);
                danielImage.setVisibility(android.view.View.VISIBLE);
                layout.setBackgroundColor(Color.argb(255, 255, 176, 71));
                switcher1.setBackgroundColor(Color.argb(255, 255, 71, 71));
                switcher1.setText(R.string.switchBruh);
                firstTime = true;
            } else {
                danielImage.setVisibility(android.view.View.GONE);
                bruhImage.setVisibility(android.view.View.VISIBLE);
                layout.setBackgroundColor(Color.argb(255, 255, 71, 71));
                switcher1.setBackgroundColor(Color.argb(255, 255, 176, 71));
                switcher1.setText(R.string.switchDaniel);
                firstTime = true;
            }
            bruhSet = !bruhSet;
        });

    }

}
