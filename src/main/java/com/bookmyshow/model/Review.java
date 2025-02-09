package com.bookmyshow.model;

public class Review {
    private String username;
    private String movieTitle;
    private String reviewText;
    private double rating;

    public Review(String username, String movieTitle, String reviewText, double rating) {
        this.username = username;
        this.movieTitle = movieTitle;
        this.reviewText = reviewText;
        this.rating = rating;
    }

    public String getUsername() { return username; }
    public String getMovieTitle() { return movieTitle; }
    public String getReviewText() { return reviewText; }
    public double getRating() { return rating; }
}

