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
    private MediaPlayer mediaPlayer;
    private boolean firstTime;
    private String buttonMessage;
    private int buttonColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Bruh button red, background red, doesn't start with button
        // Daniel button orange, background orange
        // Marmot button green, background green
        // genius button dark blue, background dark blue
        int bruhColor = Color.argb(255, 255, 71, 71);
        int danielColor = Color.argb(255, 255, 176, 71);
        int marmotColor = Color.argb(255, 71, 216, 31);
        int geniusColor = Color.argb(255, 21, 71, 255);

        ConstraintLayout layout = findViewById(R.id.constraintLayout);
        layout.setBackgroundColor(bruhColor);

        ImageView bruhImage = findViewById(R.id.bruh);
        ImageView danielImage = findViewById(R.id.daniel);
        ImageView marmotImage = findViewById(R.id.marmot);
        ImageView geniusImage = findViewById(R.id.mathgenius);

        danielImage.setVisibility(View.GONE);
        marmotImage.setVisibility(View.GONE);
        geniusImage.setVisibility(View.GONE);

        Button switcher1 = findViewById(R.id.switching_button1);
        switcher1.setBackgroundColor(danielColor);
        Button switcher2 = findViewById(R.id.switching_button2);
        switcher2.setBackgroundColor(marmotColor);
        Button switcher3 = findViewById(R.id.switching_button3);
        switcher3.setBackgroundColor(geniusColor);

        mediaPlayer = MediaPlayer.create(this, R.raw.bruh_sound);
        mediaPlayer.setOnCompletionListener(mp -> mediaPlayer.release());

        buttonMessage = getResources().getString(R.string.switchBruh);
        buttonColor = bruhColor;
        firstTime = true;

        bruhImage.setOnClickListener(View -> {
            if (firstTime) {
                mediaPlayer.release();
                mediaPlayer = MediaPlayer.create(this, R.raw.bruh_sound);
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
            }
            Log.d(TAG,"Damn Daniel");
            if (!mediaPlayer.isPlaying()) {
                mediaPlayer.start();
            }
            firstTime = false;
        });

        switcher1.setOnClickListener(View -> {
            mediaPlayer.release();
            if (switcher1.getText().toString().equals(getResources().getString(R.string.switchDaniel))) {
                switcher1.setText(buttonMessage);
                switcher1.setBackgroundColor(buttonColor);
                buttonMessage = getResources().getString(R.string.switchDaniel);
                buttonColor = danielColor;
                layout.setBackgroundColor(danielColor);
                danielImage.setVisibility(android.view.View.VISIBLE);
                bruhImage.setVisibility(android.view.View.GONE);
                marmotImage.setVisibility(android.view.View.GONE);
                geniusImage.setVisibility(android.view.View.GONE);
                mediaPlayer = MediaPlayer.create(this, R.raw.daniel_sound);
            } else if (switcher1.getText().toString().equals(getResources().getString(R.string.switchBruh))) {
                switcher1.setText(buttonMessage);
                switcher1.setBackgroundColor(buttonColor);
                buttonMessage = getResources().getString(R.string.switchBruh);
                buttonColor = bruhColor;
                layout.setBackgroundColor(bruhColor);
                danielImage.setVisibility(android.view.View.GONE);
                bruhImage.setVisibility(android.view.View.VISIBLE);
                marmotImage.setVisibility(android.view.View.GONE);
                geniusImage.setVisibility(android.view.View.GONE);
                mediaPlayer = MediaPlayer.create(this, R.raw.bruh_sound);
            } else if (switcher1.getText().toString().equals(getResources().getString(R.string.switchMarmot))) {
                switcher1.setText(buttonMessage);
                switcher1.setBackgroundColor(buttonColor);
                buttonMessage = getResources().getString(R.string.switchMarmot);
                buttonColor = marmotColor;
                layout.setBackgroundColor(marmotColor);
                danielImage.setVisibility(android.view.View.GONE);
                bruhImage.setVisibility(android.view.View.GONE);
                marmotImage.setVisibility(android.view.View.VISIBLE);
                geniusImage.setVisibility(android.view.View.GONE);
                mediaPlayer = MediaPlayer.create(this, R.raw.marmot);
            } else {
                switcher1.setText(buttonMessage);
                switcher1.setBackgroundColor(buttonColor);
                buttonMessage = getResources().getString(R.string.switch21);
                buttonColor = geniusColor;
                layout.setBackgroundColor(geniusColor);
                danielImage.setVisibility(android.view.View.GONE);
                bruhImage.setVisibility(android.view.View.GONE);
                marmotImage.setVisibility(android.view.View.GONE);
                geniusImage.setVisibility(android.view.View.VISIBLE);
                mediaPlayer = MediaPlayer.create(this, R.raw.genius);
            }
        });
        switcher2.setOnClickListener(View -> {
            mediaPlayer.release();
            if (switcher2.getText().toString().equals(getResources().getString(R.string.switchDaniel))) {
                switcher2.setText(buttonMessage);
                switcher2.setBackgroundColor(buttonColor);
                buttonMessage = getResources().getString(R.string.switchDaniel);
                buttonColor = danielColor;
                layout.setBackgroundColor(danielColor);
                danielImage.setVisibility(android.view.View.VISIBLE);
                bruhImage.setVisibility(android.view.View.GONE);
                marmotImage.setVisibility(android.view.View.GONE);
                geniusImage.setVisibility(android.view.View.GONE);
                mediaPlayer = MediaPlayer.create(this, R.raw.daniel_sound);
            } else if (switcher2.getText().toString().equals(getResources().getString(R.string.switchBruh))) {
                switcher2.setText(buttonMessage);
                switcher2.setBackgroundColor(buttonColor);
                buttonMessage = getResources().getString(R.string.switchBruh);
                buttonColor = bruhColor;
                layout.setBackgroundColor(bruhColor);
                danielImage.setVisibility(android.view.View.GONE);
                bruhImage.setVisibility(android.view.View.VISIBLE);
                marmotImage.setVisibility(android.view.View.GONE);
                geniusImage.setVisibility(android.view.View.GONE);
                mediaPlayer = MediaPlayer.create(this, R.raw.bruh_sound);
            } else if (switcher2.getText().toString().equals(getResources().getString(R.string.switchMarmot))) {
                switcher2.setText(buttonMessage);
                switcher2.setBackgroundColor(buttonColor);
                buttonMessage = getResources().getString(R.string.switchMarmot);
                buttonColor = marmotColor;
                layout.setBackgroundColor(marmotColor);
                danielImage.setVisibility(android.view.View.GONE);
                bruhImage.setVisibility(android.view.View.GONE);
                marmotImage.setVisibility(android.view.View.VISIBLE);
                geniusImage.setVisibility(android.view.View.GONE);
                mediaPlayer = MediaPlayer.create(this, R.raw.marmot);
            } else {
                switcher2.setText(buttonMessage);
                switcher2.setBackgroundColor(buttonColor);
                buttonMessage = getResources().getString(R.string.switch21);
                buttonColor = geniusColor;
                layout.setBackgroundColor(geniusColor);
                danielImage.setVisibility(android.view.View.GONE);
                bruhImage.setVisibility(android.view.View.GONE);
                marmotImage.setVisibility(android.view.View.GONE);
                geniusImage.setVisibility(android.view.View.VISIBLE);
                mediaPlayer = MediaPlayer.create(this, R.raw.genius);
            }
        });
        switcher3.setOnClickListener(View -> {
            mediaPlayer.release();
            if (switcher3.getText().toString().equals(getResources().getString(R.string.switchDaniel))) {
                switcher3.setText(buttonMessage);
                switcher3.setBackgroundColor(buttonColor);
                buttonMessage = getResources().getString(R.string.switchDaniel);
                buttonColor = danielColor;
                layout.setBackgroundColor(danielColor);
                danielImage.setVisibility(android.view.View.VISIBLE);
                bruhImage.setVisibility(android.view.View.GONE);
                marmotImage.setVisibility(android.view.View.GONE);
                geniusImage.setVisibility(android.view.View.GONE);
                mediaPlayer = MediaPlayer.create(this, R.raw.daniel_sound);
            } else if (switcher3.getText().toString().equals(getResources().getString(R.string.switchBruh))) {
                switcher3.setText(buttonMessage);
                switcher3.setBackgroundColor(buttonColor);
                buttonMessage = getResources().getString(R.string.switchBruh);
                buttonColor = bruhColor;
                layout.setBackgroundColor(bruhColor);
                danielImage.setVisibility(android.view.View.GONE);
                bruhImage.setVisibility(android.view.View.VISIBLE);
                marmotImage.setVisibility(android.view.View.GONE);
                geniusImage.setVisibility(android.view.View.GONE);
                mediaPlayer = MediaPlayer.create(this, R.raw.bruh_sound);
            } else if (switcher3.getText().toString().equals(getResources().getString(R.string.switchMarmot))) {
                switcher3.setText(buttonMessage);
                switcher3.setBackgroundColor(buttonColor);
                buttonMessage = getResources().getString(R.string.switchMarmot);
                buttonColor = marmotColor;
                layout.setBackgroundColor(marmotColor);
                danielImage.setVisibility(android.view.View.GONE);
                bruhImage.setVisibility(android.view.View.GONE);
                marmotImage.setVisibility(android.view.View.VISIBLE);
                geniusImage.setVisibility(android.view.View.GONE);
                mediaPlayer = MediaPlayer.create(this, R.raw.marmot);
            } else {
                switcher3.setText(buttonMessage);
                switcher3.setBackgroundColor(buttonColor);
                buttonMessage = getResources().getString(R.string.switch21);
                buttonColor = geniusColor;
                layout.setBackgroundColor(geniusColor);
                danielImage.setVisibility(android.view.View.GONE);
                bruhImage.setVisibility(android.view.View.GONE);
                marmotImage.setVisibility(android.view.View.GONE);
                geniusImage.setVisibility(android.view.View.VISIBLE);
                mediaPlayer = MediaPlayer.create(this, R.raw.genius);
            }
        });

    }

}
