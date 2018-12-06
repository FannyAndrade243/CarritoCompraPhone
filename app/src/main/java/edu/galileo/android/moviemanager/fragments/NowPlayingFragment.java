package edu.galileo.android.moviemanager.fragments;


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

/**
 * A simple {@link Fragment} subclass.
 */
public class NowPlayingFragment extends Fragment {


    @BindView(R.id.rvMovies)
    RecyclerView rvMovies;
    private List<Movie> movies;

    public NowPlayingFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_now_playing, container, false);
        ButterKnife.bind(this, view);

        initializeData();

        LinearLayoutManager llm = new LinearLayoutManager(this.getContext());

        rvMovies.setHasFixedSize(true);
        rvMovies.setLayoutManager(llm);

        MovieRecyclerViewAdapter adapter = new MovieRecyclerViewAdapter(getContext(), movies);
        rvMovies.setAdapter(adapter);

        return view;
    }

    private void initializeData() {

        movies = new ArrayList<>();
        movies.add(new Movie(1, "Samsung Galaxy S5", "Funda para celular", 4.00, 5.00,
                "https://i.linio.com/p/26ab285d32dfac739f9489b7ec84e850-product.jpg"));
        movies.add(new Movie(2, "Samsung Galaxy Note 3", "cuero//N9000_Negro", 3.50, 7.00,
                "https://i.linio.com/p/9e5050bf90bc7d066df205ae4fee397c-product.jpg"));
        movies.add(new Movie(3, "Samsung S8", "Case TPU Transparente-Rosa", 4.00, 7.00,
                "https://i.linio.com/p/48ec15c97c4c011a7a4c55f8dbaaa4cc-product.jpg"));
        movies.add(new Movie(4, "Samsung Galaxy j8", "Estuche Case -Venom", 3.50, 5.50,
                "https://i.linio.com/p/525fbb2b9928166fe9b2706e289e7e03-product.jpg"));
        movies.add(new Movie(5, "Samsung Galaxy nota 3", "/N9000_Rosa roja", 4.00, 5.00,
                "https://i.linio.com/p/1d77d265cbf426c92bbcb5a607e2eaff-product.jpg"));
        movies.add(new Movie(6, " Samsung Galaxy NOTE 2", "Case - torre eiffel 12", 5.00, 8.00,
                "https://i.linio.com/p/285711b124c7e96d32e16e5d5b2eb179-product.jpg"));
        movies.add(new Movie(7, "Samsung Galaxy J2 PRIME", "Case - torre eiffel 6", 4.00, 8.00,
                "https://i.linio.com/p/35a6382bc44d1b2e227eafa183c25a03-product.jpg"));
        movies.add(new Movie(8, "Samsung Galaxy S5", "Estuche - Textura 7", 3.50, 6.00,
                "https://i.linio.com/p/430910e45dd2609833fe38242269a5ba-product.jpg"));
        movies.add(new Movie(9, "Samsung Galaxy C5 PRO", "Estuche -Mario", 5.00, 4.70,
                "https://i.linio.com/p/1eddfbcfd38f06dd7699d57f40fba2ed-product.jpg"));
    }
    }


