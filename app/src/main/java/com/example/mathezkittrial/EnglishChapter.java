package com.example.mathezkittrial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Objects;

public class EnglishChapter extends AppCompatActivity {

    RecyclerView RecyclerView1;
    MyAdapter1 myAdapter1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_chapter);
        Objects.requireNonNull(getSupportActionBar()).setTitle("Topics");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView1 = findViewById(R.id.recyclerView1 );
        RecyclerView1.setLayoutManager(new LinearLayoutManager(this));

        myAdapter1 = new MyAdapter1(this,getMyList());
        RecyclerView1.setAdapter(myAdapter1);
    }

    private ArrayList<Model1> getMyList(){

        ArrayList<Model1> model1s = new ArrayList<>();

        Model1 m = new Model1();
        m.setTitle("1.0 Algebra");
        m.setDescription(" • Simplify basic algebra \n" +
                " • Solve quadratic equations \n" +
                " • Show procedures to find partial fraction");
        m.setImg(R.drawable.algebra);
        model1s.add(m);

        m = new Model1();
        m.setTitle("2.0 Trigonometry");
        m.setDescription(" • Solve the fundamental of trigonometric functions \n" +
                " • Solve trigonometric equations and identities \n" +
                " • Apply sine and cosine rules");
        m.setImg(R.drawable.triginometri);
        model1s.add(m);

        m = new Model1();
        m.setTitle("3.0 Complex Numbers");
        m.setDescription(" • Explain the concept of a complex number \n" +
                " • Demonstrate the operation of complex numbers \n" +
                " • Demonstrate graphical representation of a complex number");
        m.setImg(R.drawable.complexnumber);
        model1s.add(m);

        m = new Model1();
        m.setTitle("4.0 Matrices");
        m.setDescription(" • Introduction to Matrices \n" +
                " • Operation of matrices \n" +
                " • Simultaneous linear equations");
        m.setImg(R.drawable.matrix);
        model1s.add(m);

        m = new Model1();
        m.setTitle("5.0 Vector And Scalar");
        m.setDescription(" • Introduction to vector \n" +
                " • Operation of vectors \n" +
                " • Scalar (dot) product of two vectors \n" +
                " • Vector (cross) product of two vectors");
        m.setImg(R.drawable.vector);
        model1s.add(m);

        return model1s;



    }


}