package com.a2zdevelopers.recyclerviewn;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;


public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {
    List<Movie> list;
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
       View view =  LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.list_items, viewGroup, false);
        return new MyViewHolder(view);
    }
    public MovieAdapter(List<Movie> movieList){
        this.list = movieList;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

    Movie movie = list.get(i);
    myViewHolder.textView1.setText(movie.getS1());
    myViewHolder.textView2.setText(movie.getS2());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
         TextView textView1,textView2;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
           textView1 = itemView.findViewById(R.id.textItem1);
           textView2 = itemView.findViewById(R.id.textItem2);
        }
    }
}
