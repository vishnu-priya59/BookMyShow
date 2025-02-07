package com.bookmyshow.database;
import bookMyShow.demo.models.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MovieDB {
    private static List<Movie> movies = new ArrayList<>();

    static {
        movies.add(new Movie("Inception", "Christopher Nolan", "Sci-Fi", 148, 8.8, LocalDate.of(2010, 7, 16), "A thief who steals corporate secrets through the use of dream-sharing technology."));
        movies.add(new Movie("The Dark Knight", "Christopher Nolan", "Action", 152, 9.0, LocalDate.of(2008, 7, 18), "Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice."));
        movies.add(new Movie("The Shawshank Redemption", "Frank Darabont", "Drama", 142, 9.3, LocalDate.of(1994, 9, 23), "Two imprisoned men bond over several years, finding solace and eventual redemption through acts of common decency."));
        movies.add(new Movie("The Godfather", "Francis Ford Coppola", "Crime", 175, 9.2, LocalDate.of(1972, 3, 24), "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son."));
        movies.add(new Movie("Pulp Fiction", "Quentin Tarantino", "Crime", 154, 8.9, LocalDate.of(1994, 10, 14), "The lives of two hitmen, a boxer, a gangster's wife, and a pair of diner bandits intertwine in four tales of violence and redemption."));
        movies.add(new Movie("Fight Club", "David Fincher", "Drama", 139, 8.8, LocalDate.of(1999, 10, 15), "An insomniac office worker and a devil-may-care soap maker form an underground fight club that evolves into something much more."));
        movies.add(new Movie("The Matrix", "Lana Wachowski, Lilly Wachowski", "Sci-Fi", 136, 8.7, LocalDate.of(1999, 3, 31), "A computer hacker learns from mysterious rebels about the true nature of his reality and his role in the war against its controllers."));
        movies.add(new Movie("Forrest Gump", "Robert Zemeckis", "Drama", 142, 8.8, LocalDate.of(1994, 7, 6), "The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal, and other historical events unfold from the perspective of an Alabama man with an IQ of 75."));
        movies.add(new Movie("The Lord of the Rings: The Return of the King", "Peter Jackson", "Fantasy", 201, 9.0, LocalDate.of(2003, 12, 17), "Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring."));
    }

    public static List<Movie> getMovies() {
        return movies;
    }
}
