package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AktivitiBm extends AppCompatActivity {

    CardView permainan1;
    CardView permainan2;
    CardView permainan3;
    CardView permainan4;
    CardView permainan5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aktiviti_bm);
        getSupportActionBar().setTitle("Aktiviti");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        permainan1 = findViewById(R.id.permainan1);
        permainan2 = findViewById(R.id.permainan2);
        permainan3 = findViewById(R.id.permainan3);
        permainan4 = findViewById(R.id.permainan4);
        permainan5 = findViewById(R.id.permainan5);

        permainan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mathgames.com/skill/3.75-solve-for-the-variable-with-addition-and-subtraction"));
                startActivity(browserIntent);

            }
        });

        permainan2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coolmathgames.com/0-sudoku"));
                startActivity(browserIntent);
            }
        });

        permainan3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mathsisfun.com/games/ninja/balloon/"));
                startActivity(browserIntent);
            }
        });

        permainan4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coolmathgames.com/0-math-clash"));
                startActivity(browserIntent);
            }
        });

        permainan5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mathgames.com/skill/7.118-mixed-equations-with-fractions-mixed-numbers"));
                startActivity(browserIntent);
            }
        });
    }
}