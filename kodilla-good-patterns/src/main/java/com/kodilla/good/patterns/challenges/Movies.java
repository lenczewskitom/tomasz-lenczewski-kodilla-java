package com.kodilla.good.patterns.challenges;


import com.kodilla.good.patterns.challenges.MovieStore;
import java.util.stream.Collectors;

public class Movies {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();

        String movies = movieStore.getMovies().entrySet().stream()
                .flatMap(m -> m.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(movies);


    }
}
