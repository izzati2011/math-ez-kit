package com.example.mathezkittrial;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import java.util.ArrayList;
import java.util.List;

public class TajukLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tajuk_layout);
        getSupportActionBar().setTitle("Isi Kandungan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);




    }

    public void tajuk1pdf(View view) {
        Intent intent = new Intent(TajukLayout.this, Tajuk1.class);
        startActivity(intent);
    }

    public void Tajuk2pdf(View view) {
        Intent intent = new Intent(TajukLayout.this, Chapter2.class);
        startActivity(intent);
    }

    public void Tajuk3pdf(View view) {
        Intent intent = new Intent(TajukLayout.this, Chapter3.class);
        startActivity(intent);

    }

    public void Tajuk4pdf(View view) {
        Intent intent = new Intent(TajukLayout.this, Chapter4.class);
        startActivity(intent);
    }

    public void Tajuk5pdf(View view) {
        Intent intent = new Intent(TajukLayout.this, Chapter5.class);
        startActivity(intent);
    }
} 
