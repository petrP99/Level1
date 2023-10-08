package com.PetroP.Lesson9;

import java.util.*;

public class Cinema {

    static HashMap<Integer, List<Movie>> moviesByYear = new LinkedHashMap<>();

    public static void addMovie(Movie movie) {
        if (moviesByYear.containsKey(movie.getYear())) {
            List<Movie> movies = moviesByYear.get(movie.getYear());
            movies.add(movie);
        } else {
            List<Movie> movies = new ArrayList<>();
            movies.add(movie);
            moviesByYear.put(movie.getYear(), movies);
        }
    }

    public static void printFullMap() {
        for (Map.Entry<Integer, List<Movie>> entry : moviesByYear.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static List<Movie> getMoviesByYear(int year) {
        return moviesByYear.getOrDefault(year, new ArrayList<>());
    }

    public static List<Movie> getMoviesByYearAndMonth(int year, String month) {
        List<Movie> moviesByYear = getMoviesByYear(year);
        List<Movie> moviesByYearAndMonth = new ArrayList<>();
        for (Movie movie : moviesByYear) {
            if (movie.getMonth().equals(month)) moviesByYearAndMonth.add(movie);
        }
        return moviesByYearAndMonth;
    }

    public static List<Movie> getMoviesByGenre(String genre) {
        List<Movie> moviesByGenre = new ArrayList<>();
        for (List<Movie> list : moviesByYear.values()) {
            for (Movie movie : list) {
                if (movie.getGenre().equals(genre)) moviesByGenre.add(movie);
            }
        }
        return moviesByGenre;
    }

    public static List<Movie> getMoviesTop10() {
        List<Movie> allMovies = new ArrayList<>();
        List<Movie> moviesTop10 = new ArrayList<>();
        for (List<Movie> list : moviesByYear.values()) {
            allMovies.addAll(list);
        }
        allMovies.sort(Comparator.comparing(Movie::getRating).reversed());
        for (Movie allMovie : allMovies) {
            if (moviesTop10.size() < 10) {
                moviesTop10.add(allMovie);
            }
        }
        return moviesTop10;
    }
}


