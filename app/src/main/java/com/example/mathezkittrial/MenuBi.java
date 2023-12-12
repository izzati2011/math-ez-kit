package com.example.mathezkittrial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MenuBi extends AppCompatActivity {

    CardView courseoutline;
    CardView topics;
    CardView activities;
    CardView question;
    CardView videos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_bi);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.home);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        courseoutline = findViewById(R.id.course);
        topics = findViewById(R.id.topic);
        activities = findViewById(R.id.aktivities);
        question = findViewById(R.id.question);
        videos = findViewById(R.id.videos);

        courseoutline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuBi.this,CourseOutline.class);
                startActivity(i);
            }
        });

        topics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuBi.this,EnglishChapter.class);
                startActivity(i);
            }
        });

        activities.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuBi.this,Games.class);
                startActivity(i);

            }
        });

        question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuBi.this,FinalPaper.class);
                startActivity(i);

            }
        });

        videos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuBi.this,VideoEng.class);
                startActivity(i);

            }
        });
    }

    public void Googleform(View view){
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

            Intent intent = new Intent(MenuBi.this,HomeActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}