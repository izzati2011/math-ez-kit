package com.example.mathezkittrial;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class SoalanFinal extends AppCompatActivity {

    ListView pdfListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soalan_final);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Soalan Peperiksaan Akhir");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        pdfListView=(ListView) findViewById(R.id.PDFList);

        String[] pdfFiles = {"DBM10013 ENGINEERING MATHEMATICS 1 JUN 2019","DBM1013 - ENGINEERING MATHEMATICS 1 DIS 2018",
        "DBM1013 ENGINEERING MATHEMATICS 1 JUN 2018","DBM1013- ENGINEERING MATHEMATICS 1 DIS 2017",
                "DBM1013 ENGINEERING MATHEMATICS 1 DIS 2015","DBM1013 ENGINEERING MATHEMATICS 1 JUN 2015",
                "DBM1013 ENGINEERING MATHEMATICS 1 DIS 2014","DBM1013 ENGINEERING MATHEMATICS 1 JUN 2014"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,pdfFiles){
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

                View view = super.getView(position, convertView, parent);
                TextView myText = (TextView) view.findViewById(android.R.id.text1);
                return view;
            }
        };
        pdfListView.setAdapter(adapter);

        pdfListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = pdfListView.getItemAtPosition(i).toString();
                Toast.makeText(getApplicationContext(),"You clicked:"+item,Toast.LENGTH_SHORT).show();

                Intent start = new Intent(getApplicationContext(),PDFOpener.class);
                start.putExtra("pdfFileName",item);
                startActivity(start);
            }
        });
    }
}