package edu.galileo.android.moviemanager.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.galileo.android.moviemanager.R;
import edu.galileo.android.moviemanager.models.Movie;

public class MovieDetailActivity extends AppCompatActivity {

    Movie movie;
    @BindView(R.id.ivMovieBackdrop)
    ImageView ivMovieBackdrop;
    @BindView(R.id.tvOverview)
    TextView tvOverview;

    static List<Movie> listacarrito = new ArrayList<Movie>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        ButterKnife.bind(this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* Snackbar.make(view, "Movie saved as favorite", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                if (validaLista()){
                    Snackbar.make(view, "PRODUCTO SE HA ELIMINADO DE TU LISTA DE COMPRAS", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    listacarrito.remove(movie);
                }else{
                    Snackbar.make(view, "PRODUCTO SE HA AGREGADO AL CARRITO", Snackbar.LENGTH_LONG)
                            .setAction("Action", null).show();
                    listacarrito.add(movie);

                }

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            movie = (Movie) extras.getSerializable("MOVIE");
            this.setTitle(movie.getTitle());
            tvOverview.setText(movie.getOverview());

            Picasso.with(this)
                    .load(movie.getImagen())
                    .into(ivMovieBackdrop);

        }
    }
    //metodo buleano para recorrer la lista por medio del id
    public boolean validaLista(){
        for (Movie lista : listacarrito){
            if (lista.getId()== movie.getId()){
                return true;
            }
        }
        return false;
    }

    public static List<Movie> getListacarrito() {
        return listacarrito;
    }
}
