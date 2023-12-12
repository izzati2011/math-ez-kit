package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Games extends AppCompatActivity {

    CardView games1;
    CardView games2;
    CardView games3;
    CardView games4;
    CardView games5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games);
        getSupportActionBar().setTitle("Aktivities");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        games1 = findViewById(R.id.games1);
        games2 = findViewById(R.id.games2);
        games3 = findViewById(R.id.games3);
        games4 = findViewById(R.id.games4);
        games5 = findViewById(R.id.games5);

        games1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mathgames.com/skill/3.75-solve-for-the-variable-with-addition-and-subtraction"));
                startActivity(browserIntent);
            }
        });

        games2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coolmathgames.com/0-sudoku"));
                startActivity(browserIntent);
            }
        });

        games3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mathsisfun.com/games/ninja/balloon/"));
                startActivity(browserIntent);
            }
        });

        games4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.coolmathgames.com/0-math-clash"));
                startActivity(browserIntent);

            }
        });

        games5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mathgames.com/skill/7.118-mixed-equations-with-fractions-mixed-numbers"));
                startActivity(browserIntent);
            }
        });


    }
}