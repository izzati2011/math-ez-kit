package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Chapter4 extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter4);

        pdfView = (PDFView) findViewById(R.id.pdf);
        pdfView.fromAsset("BA101-Chapter-4-Geometry-and-Measurement.pdf" ).load();
    }
}