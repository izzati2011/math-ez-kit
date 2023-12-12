package com.example.mathezkittrial;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    Context c;
    ArrayList<Model>models;

    public MyAdapter(Context c, ArrayList<Model> models) {
        this.c = c;
        this.models = models;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row, null);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {

        myHolder.mTitle.setText(models.get(i).getTitle());
        myHolder.mDes.setText(models.get(i).getDescription());
        myHolder.mImageView.setImageResource(models.get(i).getImg());


        myHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                if(models.get(position).getTitle().equals("1.0 Asas Algebra")){
                    Intent intent = new Intent(c,Tajuk1.class);
                    c.startActivity(intent);
                }

                if(models.get(position).getTitle().equals("2.0 Trigonometri")){
                    Intent intent = new Intent(c,Chapter2.class);
                    c.startActivity(intent);
                }

                if(models.get(position).getTitle().equals("3.0 Nombor Kompleks")){
                    Intent intent = new Intent(c,Chapter3.class);
                    c.startActivity(intent);
                }

                if(models.get(position).getTitle().equals("4.0 Matrik")){
                    Intent intent = new Intent(c,Chapter4.class);
                    c.startActivity(intent);
                }

                if(models.get(position).getTitle().equals("5.0 Vektor dan skalar")){
                    Intent intent = new Intent(c,Chapter5.class);
                    c.startActivity(intent);
                }


    }
});


    }

    @Override
    public int getItemCount() {
        return models.size();
    }
}