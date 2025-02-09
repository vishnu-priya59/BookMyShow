package com.bookmyshow.model;
import java.time.LocalDate;

public class Movie {
    private String name;
    private String director;
    private String genre;
    private int duration; // in minutes
    private double rating; // out of 10
    private LocalDate releaseDate;
    private String description;

    public Movie(String name, String director, String genre, int duration, double rating, LocalDate releaseDate, String description) {
        this.name = name;
        this.director = director;
        this.genre = genre;
        this.duration = duration;
        this.rating = rating;
        this.releaseDate = releaseDate;
        this.description = description;
    }

    public String getName() { return name; }
    public String getDirector() { return director; }
    public String getGenre() { return genre; }
    public int getDuration() { return duration; }
    public double getRating() { return rating; }
    public LocalDate getReleaseDate() { return releaseDate; }
    public String getDescription() { return description; }
}
