package com.gla.stream_api;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class TrendingMovies {
    static class Movie {
        String name;
        double rating;
        int year;

        Movie(String n, double r, int y) {
            name = n; rating = r; year = y;
        }
        public String toString() { return name + " (" + rating + ", " + year + ")"; }
    }

    public static void main(String[] args) {
        List<Movie> movies = List.of(
            new Movie("Inception", 8.8, 2010),
            new Movie("Interstellar", 8.6, 2014),
            new Movie("Titanic", 7.9, 1997),
            new Movie("Avatar", 7.8, 2009),
            new Movie("The Dark Knight", 9.0, 2008),
            new Movie("Matrix", 8.7, 1999)
        );

        System.out.println("Top 5 Trending Movies:");
        List<Movie> top5 = movies.stream()
            .sorted(Comparator.comparingDouble((Movie m) -> m.rating)
                              .thenComparingInt(m -> m.year).reversed())
            .limit(5)
            .collect(Collectors.toList());
            
        top5.forEach(System.out::println);
    }
}
