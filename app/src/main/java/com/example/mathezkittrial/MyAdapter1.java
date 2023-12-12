package com.example.mathezkittrial;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter1 extends RecyclerView.Adapter<MyHolder1> {
    Context c;
    ArrayList<Model1>model1s;

    public MyAdapter1(Context c, ArrayList<Model1> model1s) {
        this.c = c;
        this.model1s = model1s;
    }

    @NonNull
    @Override
    public MyHolder1 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row2, null);

        return new MyHolder1(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder1 myHolder1, int i) {

        myHolder1.mTitle.setText(model1s.get(i).getTitle());
        myHolder1.mDes.setText(model1s.get(i).getDescription());
        myHolder1.mImageView.setImageResource(model1s.get(i).getImg());


        myHolder1.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClickListener(View v, int position) {
                if(model1s.get(position).getTitle().equals("1.0 Algebra")){
                    Intent intent = new Intent(c,Topic1.class);
                    c.startActivity(intent);
                }

                if(model1s.get(position).getTitle().equals("2.0 Trigonometry")){
                    Intent intent = new Intent(c,Topic2.class);
                    c.startActivity(intent);
                }

                if(model1s.get(position).getTitle().equals("3.0 Complex Numbers")){
                    Intent intent = new Intent(c,Topic3.class);
                    c.startActivity(intent);
                }

                if(model1s.get(position).getTitle().equals("4.0 Matrices")){
                    Intent intent = new Intent(c,Topic4.class);
                    c.startActivity(intent);
                }

                if(model1s.get(position).getTitle().equals("5.0 Vector And Scalar")){
                    Intent intent = new Intent(c,Topic5.class);
                    c.startActivity(intent);
                }




    }
});


    }

    @Override
    public int getItemCount() {
        return model1s.size();
    }
}