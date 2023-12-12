package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class VideoEng extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_eng);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Video");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}