package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class Video extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Video");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}