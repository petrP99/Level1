package com.PetroP.Lesson9;


public class CinemaRunner {
    public static void main(String[] args) {

        Movie film = new Movie(1, 2001, "January", "Comedy", 7.5);
        Movie film1 = new Movie(2, 2010, "January", "Detective", 8.4);
        Movie film2 = new Movie(3, 1995, "April", "Drama", 6.1);
        Movie film3 = new Movie(4, 1995, "December", "Horror", 7.8);
        Movie film4 = new Movie(5, 1986, "April", "Fantasy", 8.3);
        Movie film5 = new Movie(6, 1995, "December", "Detective", 7.6);
        Movie film6 = new Movie(7, 2019, "June", "Comedy", 8);
        Movie film7 = new Movie(8, 2016, "August", "Drama", 9.1);
        Movie film8 = new Movie(9, 2010, "December", "Fantasy", 7.7);
        Movie film9 = new Movie(10, 1990, "June", "Comedy", 8.1);
        Movie film10 = new Movie(11, 2002, "September", "Detective", 6.6);

        Cinema.addMovie(film);
        Cinema.addMovie(film1);
        Cinema.addMovie(film2);
        Cinema.addMovie(film3);
        Cinema.addMovie(film4);
        Cinema.addMovie(film6);
        Cinema.addMovie(film7);
        Cinema.addMovie(film8);
        Cinema.addMovie(film9);
        Cinema.addMovie(film10);
        Cinema.addMovie(new Movie(45, 2001, "June", "Drama", 9.4));
        Cinema.addMovie(new Movie(55, 2002, "Jule", "Fantasy", 7.4));
        Cinema.addMovie(new Movie(55, 2002, "Jule", "Fantasy", 7.4));

        Cinema.printFullMap();
        System.out.println(Cinema.getMoviesByYear(2019));
        System.out.println(Cinema.getMoviesByYearAndMonth(1995, "December"));
        System.out.println(Cinema.getMoviesByGenre("Fantasy"));
        System.out.println(Cinema.getMoviesTop10());
    }
}
