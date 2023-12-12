package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class HomeActivity extends AppCompatActivity {

    CardView lang1;
    CardView lang2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_home_activity);

        lang1 = findViewById(R.id.lang1);
        lang2 = findViewById(R.id.lang2);

        lang1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,MenuBi.class );
                startActivity(intent);
            }
        });

        lang2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,MenuBm.class );
                startActivity(intent);
            }
        });


    }
}



