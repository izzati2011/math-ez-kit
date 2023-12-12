package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.scroll.DefaultScrollHandle;

import java.util.Objects;

public class PDFList extends AppCompatActivity {

    PDFView myPDFViewer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_d_f_list);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("JMSK");


        myPDFViewer=(PDFView) findViewById(R.id.pdfViewer);

        String getItem= getIntent().getStringExtra("pdfFileName");

        if(getItem.equals("DBM10013 ENGINEERING MATHEMATICS 1 JUN 2019")){
            myPDFViewer.fromAsset("DBM10013 ENGINEERING MATHEMATICS 1 JUN 2019.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(2)
                    .load();
        }

        if(getItem.equals("DBM1013 - ENGINEERING MATHEMATICS 1 DIS 2018")){
            myPDFViewer.fromAsset("DBM1013 - ENGINEERING MATHEMATICS 1 DIS 2018.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(2)
                    .load();
        }
        if(getItem.equals("DBM1013 ENGINEERING MATHEMATICS 1 JUN 2018")){
            myPDFViewer.fromAsset("DBM1013 ENGINEERING MATHEMATICS 1 JUN 2018.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(2)
                    .load();
        }
        if(getItem.equals("DBM1013- ENGINEERING MATHEMATICS 1 DIS 2017")){
            myPDFViewer.fromAsset("DBM1013- ENGINEERING MATHEMATICS 1 DIS 2017.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(2)
                    .load();
        }
        if(getItem.equals("DBM1013 ENGINEERING MATHEMATICS 1 DIS 2015")){
            myPDFViewer.fromAsset("DBM1013 ENGINEERING MATHEMATICS 1 DIS 2015.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(2)
                    .load();
        }
        if(getItem.equals("DBM1013 ENGINEERING MATHEMATICS 1 JUN 2015")){
            myPDFViewer.fromAsset("DBM1013 ENGINEERING MATHEMATICS 1 JUN 2015.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(2)
                    .load();
        }
        if(getItem.equals("DBM1013 ENGINEERING MATHEMATICS 1 DIS 2014")){
            myPDFViewer.fromAsset("DBM1013 ENGINEERING MATHEMATICS 1 DIS 2014.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(2)
                    .load();
        }
        if(getItem.equals("DBM1013 ENGINEERING MATHEMATICS 1 JUN 2014")){
            myPDFViewer.fromAsset("DBM1013 ENGINEERING MATHEMATICS 1 JUN 2014.pdf")
                    .defaultPage(0)
                    .enableAnnotationRendering(true)
                    .scrollHandle(new DefaultScrollHandle(this))
                    .spacing(2)
                    .load();
        }
    }
}
