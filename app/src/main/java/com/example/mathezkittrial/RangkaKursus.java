package com.example.mathezkittrial;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class RangkaKursus extends AppCompatActivity {

    private PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.rangka_kursus);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        pdfView = (PDFView) findViewById(R.id.pdf);
        pdfView.fromAsset("Pengenalan MATEMATIK KEJURUTERAAN 1 mendedahkan pelajar kepada algebra.pdf" ).load();


    }
}