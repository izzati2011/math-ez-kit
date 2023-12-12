package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class KandunganTajuk extends AppCompatActivity {

    RecyclerView mRecyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kandungan_tajuk);
        getSupportActionBar().setTitle("Isi Kandungan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mRecyclerView = findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        myAdapter = new MyAdapter(this,getMyList());
        mRecyclerView.setAdapter(myAdapter);
    }

    private ArrayList<Model> getMyList(){

        ArrayList<Model> models = new ArrayList<>();

        Model m = new Model();
        m.setTitle("1.0 Asas Algebra");
        m.setDescription (" • Permudahkan Algebra\n" +
                " • Persamaan Kuadratik\n" +
                " • Prosedur untuk mendapatkan pecahan separa");
        m.setImg(R.drawable.algebra);
        models.add(m);

        m = new Model();
        m.setTitle("2.0 Trigonometri");
        m.setDescription(" • Asas fungsi trigonometri\n" +
                " • Persamaan dan identiti trigonometri\n" +
                " • Petua sin dan kos");
        m.setImg(R.drawable.triginometri);
        models.add(m);

        m = new Model();
        m.setTitle("3.0 Nombor Kompleks");
        m.setDescription(" • Konsep nombor kompleks \n" +
                " • Operasi nombor kompleks \n" +
                " • Perwakilan rajah bagi nombor kompleks");
        m.setImg(R.drawable.complexnumber);
        models.add(m);

        m = new Model();
        m.setTitle("4.0 Matrik");
        m.setDescription(" • Pengenalan kepada Matrik \n" +
                " • Operasi matrik \n" +
                " • Persamaan linear serentak");
        m.setImg(R.drawable.matrix);
        models.add(m);

        m = new Model();
        m.setTitle("5.0 Vektor dan skalar");
        m.setDescription(" • Pengenalan kepada vektor \n" +
                " • Operasi vektor \n" +
                " • Hasil skalar (dot) dua vektor \n" +
                " • Hasil vektor (silang) dua vektor");
        m.setImg(R.drawable.vector);
        models.add(m);

        return models;



    }
}