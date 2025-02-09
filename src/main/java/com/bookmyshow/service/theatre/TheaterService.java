
package com.bookmyshow.service.theatre;

import com.bookmyshow.model.theatre.Theater;
import com.bookmyshow.model.Seat;
import java.util.*;

public class TheaterService {
    private List<Theater> theaters = new ArrayList<>();

    public Theater createTheater(String name, String location, List<Seat> seats) {
        Theater theater = new Theater(name, location, seats);
        theaters.add(theater);
        return theater;
    }

    public Theater searchTheater(String name) {
        return theaters.stream()
                .filter(t -> t.getName().equalsIgnoreCase(name))
                .findFirst()
                .orElse(null);
    }

    public void displayTheaterDetails(Theater theater) {
        System.out.println("\nTheater Details:");
        System.out.println("Name: " + theater.getName());
        System.out.println("Location: " + theater.getLocation());
        System.out.println("Available Seats: " +
                theater.getSeats().stream().filter(s -> !s.isBooked()).count());
    }
}
