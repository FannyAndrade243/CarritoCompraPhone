package edu.galileo.android.moviemanager.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.galileo.android.moviemanager.R;
import edu.galileo.android.moviemanager.adapters.MovieRecyclerViewAdapter;
import edu.galileo.android.moviemanager.models.Movie;


public class IphoneFragment extends Fragment {
    @BindView(R.id.rvMovies)
    RecyclerView rvMovies;
    private List<Movie> movies;


    public IphoneFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_upcoming, container, false);

        ButterKnife.bind(this, view);

        initializeData();

        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());
        rvMovies.setHasFixedSize(true);
        rvMovies.setLayoutManager(llm);

        MovieRecyclerViewAdapter adapter = new MovieRecyclerViewAdapter(this.getContext(), movies);
        rvMovies.setAdapter(adapter);

        return view;
    }


    private void initializeData() {
        movies = new ArrayList<>();
        movies.add(new Movie(1, "iPhone 7/8/8P/iPhoneX", "Cubierta Caja floral", 3.50, 10.00,
                "https://i.linio.com/p/171f8ed7bd6672f76f6492914a9e5db0-product.jpg"));
        movies.add(new Movie(2, "iPhone 5S/6S/8P/iPhoneX", "Caja nieve Navidad ", 4.50, 8.50,
                "https://i.linio.com/p/fb5aad3c2b7d08381f99bdb3c30c9e60-product.jpg"));
        movies.add(new Movie(3, "Celular iPhone 6/iPhone 7", "Caja felp PC contra rasguño  ", 4.50, 8.50,
                "https://i.linio.com/p/c478417807483767b816a8cb843edb93-product.jpg"));

    }

}
