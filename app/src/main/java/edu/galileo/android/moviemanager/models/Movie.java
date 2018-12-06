package edu.galileo.android.moviemanager.models;


import java.io.Serializable;
import java.util.Objects;

public class Movie implements Serializable{

    int id;
    String title;
    String overview;
    private double rating;
    private double precio;
    private String imagen;



    public Movie(int id, String title, String overview, double rating, double precio, String imagen) {
        this.id = id;
        this.title = title;
        this.overview = overview;
        this.rating = rating;
        this.precio=precio;
        this.imagen=imagen;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id;
    }

    @Override
    public int hashCode() {

        return (id);
    }
}
