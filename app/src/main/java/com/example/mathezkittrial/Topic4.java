package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

import java.util.Objects;

public class Topic4 extends AppCompatActivity {

    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic4);
        Objects.requireNonNull(getSupportActionBar()).setTitle("4.0 Matrices");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pdfView = (PDFView) findViewById(R.id.pdf);
        pdfView.fromAsset("Chapter 4- Matrices.pdf" )
                .defaultPage(0)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(2)
                .load();
    }
}