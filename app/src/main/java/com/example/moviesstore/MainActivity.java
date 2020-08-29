package com.example.moviesstore;

import Controler.MoviesAdapter;
import Movie.Movie;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MoviesAdapter moviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerView);

        moviesAdapter = new MoviesAdapter(movieList, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(moviesAdapter);
        Movies_Data();
    }

    private void Movies_Data() {
        Movie movie = new Movie("The Shawshank Redemption","Crime | Drama","19ooo94",R.drawable.playstore);
        movieList.add(movie);
        Movie movie1 = new Movie("The "," Drama","1666994",R.drawable.playstore);
        movieList.add(movie1);
        Movie movie2 = new Movie("The Redemption","Crime","1944494",R.drawable.playstore);
        movieList.add(movie2);
        Movie movie3 = new Movie("The Shawshank "," Drama","1922294",R.drawable.playstore);
        movieList.add(movie3);
        Movie movie4 = new Movie("The Shawshaklklknk Redemption","Crime | Dklmklrama","1111",R.drawable.playstore);
        movieList.add(movie4);


        moviesAdapter.notifyDataSetChanged();
    }
}
