package com.PetroP.Lesson9;

import java.util.Objects;

public class Movie {

    private int id;
    private int year;
    private String month;
    private String genre;
    private double rating;

    public Movie(int id, int year, String month, String genre, double rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "\n" + "Movie{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return id == movie.id && year == movie.year && Double.compare(movie.rating, rating) == 0
                && Objects.equals(month, movie.month) && Objects.equals(genre, movie.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
