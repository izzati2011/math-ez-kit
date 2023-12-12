package com.example.mathezkittrial;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BmLayout extends AppCompatActivity {
    Button btnTajuk2;
    Button btnSoalanExam;
    Button btnVideo2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bm_layout);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnTajuk2= findViewById(R.id.btnTajuk2);
        btnSoalanExam = findViewById(R.id.btnSoalanExam);
        btnVideo2 = findViewById(R.id.btnVideo2);

        btnVideo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BmLayout.this,Video.class);
                startActivity(i);
            }
        });


        btnSoalanExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BmLayout.this,SoalanFinal.class);
                startActivity(i);
            }
        });


        btnTajuk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BmLayout.this,KandunganTajuk.class);
                startActivity(i);
            }
        });




    }

    public void rangkakursuspdf(View view) {
        Intent intent = new Intent(BmLayout.this,RangkaKursus.class );
         startActivity(intent);

        }
    public void Googleform1(View view){
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdj8ixhYMVB3LqVjVNwhBDwSyTF38udp2P1JMBo47RAUBh2iA/viewform?usp=sf_link"));
        startActivity(browserIntent);
    }
    }
