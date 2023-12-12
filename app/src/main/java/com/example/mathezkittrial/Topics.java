package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Objects;

public class Topics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topics);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Topics");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void Chapter1pdf(View view) {
        Intent intent = new Intent(Topics.this, Topic1.class);
        startActivity(intent);
    }

    public void Chapter2pdf(View view) {
        Intent intent = new Intent(Topics.this, Topic2.class);
        startActivity(intent);
    }

    public void Chapter3pdf(View view) {
        Intent intent = new Intent(Topics.this, Topic3.class);
        startActivity(intent);
    }

    public void Chapter4pdf(View view) {
        Intent intent = new Intent(Topics.this, Topic4.class);
        startActivity(intent);
    }

    public void Chapter5pdf(View view) {
        Intent intent = new Intent(Topics.this, Topic5.class);
        startActivity(intent);
    }
}