package com.example.mathezkittrial;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MenuBm extends AppCompatActivity {

    CardView rangka;
    CardView tajuk;
    CardView aktivity;
    CardView soalan;
    CardView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bm);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        rangka = findViewById(R.id.rangka);
        tajuk = findViewById(R.id.tajuk);
        aktivity = findViewById(R.id.aktivity);
        soalan = findViewById(R.id.soalan);
        video = findViewById(R.id.video);

        rangka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuBm.this,RangkaKursus.class );
                startActivity(intent);

            }
        });

        tajuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuBm.this,KandunganTajuk.class);
                startActivity(i);


            }
        });

        aktivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuBm.this,AktivitiBm.class);
                startActivity(i);


            }
        });

        soalan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuBm.this,SoalanFinal.class);
                startActivity(i);


            }
        });

        video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuBm.this,Video.class);
                startActivity(i);

            }
        });

    }

    public void Googleform1(View view){
        Intent browserIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/e/1FAIpQLSdj8ixhYMVB3LqVjVNwhBDwSyTF38udp2P1JMBo47RAUBh2iA/viewform?usp=sf_link"));
        startActivity(browserIntent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menuitem, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.lang){

            Intent intent = new Intent(MenuBm.this,HomeActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}