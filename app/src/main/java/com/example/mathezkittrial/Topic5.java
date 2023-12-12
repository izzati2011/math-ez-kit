package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

import java.util.Objects;

public class Topic5 extends AppCompatActivity {

    private PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic5);
        Objects.requireNonNull(getSupportActionBar()).setTitle("5.0 Vector & Scalar");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pdfView = (PDFView) findViewById(R.id.pdf);
        pdfView.fromAsset("Chapter 5- Vector & Scalar.pdf" )
                .defaultPage(0)
                .enableAnnotationRendering(true)
                .scrollHandle(new DefaultScrollHandle(this))
                .spacing(2)
                .load();

    }
}