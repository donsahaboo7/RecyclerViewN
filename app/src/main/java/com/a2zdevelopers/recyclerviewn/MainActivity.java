package com.a2zdevelopers.recyclerviewn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Movie> list = new ArrayList<>();
    RecyclerView recyclerView ;
    private MovieAdapter movieAdapter;
    TextView textView1,textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler);

        movieAdapter = new MovieAdapter(list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(movieAdapter);
        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie("Tom ","Mision");
        list.add(movie);
      movie = new Movie("Tom crooz ","Mision 2");
        list.add(movie);
        movieAdapter.notifyDataSetChanged();
    }
}
