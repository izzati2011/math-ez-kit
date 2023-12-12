package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Chapter5 extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter5);

        pdfView = (PDFView) findViewById(R.id.pdf);
        pdfView.fromAsset("BA101-Chapter-5-Geometry-Coordinate-and-Graph.pdf" ).load();
    }
}