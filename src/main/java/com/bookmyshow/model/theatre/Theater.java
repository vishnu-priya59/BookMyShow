package com.bookmyshow.model.theatre;
import com.bookmyshow.model.Seat;
import java.util.List;
import static com.bookmyshow.model.Seat.seats;

public class Theater {
    private String name;
    private String location;
    private List<Seat> shows;

    public Theater(String name, String location, List<Seat> shows) {
        this.name = name;
        this.location = location;
        this.shows = shows;
    }

    public String getName() { return name; }
    public String getLocation() { return location; }
    //public List<Seat> getShows() { return shows; }
    public void showDetails() {
        System.out.println("Theater: " + name + ", Location: " + location);
    }

    public List<Seat> getSeats() {
        return seats;
    }
}


