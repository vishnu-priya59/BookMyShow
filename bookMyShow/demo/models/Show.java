package bookMyShow.demo.models;

import java.time.LocalDateTime;

public class Show {
    private Movie movie;
    private LocalDateTime showTime;
    private int availableSeats;

    public Show(Movie movie, LocalDateTime showTime, int availableSeats) {
        this.movie = movie;
        this.showTime = showTime;
        this.availableSeats = availableSeats;
    }

    public Movie getMovie() { return movie; }
    public LocalDateTime getShowTime() { return showTime; }
    public int getAvailableSeats() { return availableSeats; }
}
