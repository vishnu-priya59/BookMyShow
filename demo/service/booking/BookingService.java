package bookMyShow.demo.service.booking;

import bookMyShow.demo.models.Seat;
import bookMyShow.demo.models.Movie;
import bookMyShow.demo.models.theatre.Theater;

import java.util.*;

public class BookingService {
    private final Object lock = new Object();

    public void bookTickets(Theater theater, List<String> seatNumbers, Movie movie) {
        synchronized(lock) {
            List<Seat> seats = Seat.getSeats();
            seatNumbers.forEach(seatNumber -> {
                seats.stream()
                        .filter(s -> s.getSeatNumber().equals(seatNumber) && !s.isBooked())
                        .findFirst()
                        .ifPresent(Seat::bookSeat);
            });
            System.out.println("\nBooked " + seatNumbers.size() +
                     " seats for " + movie.getName());
        }
    }
}