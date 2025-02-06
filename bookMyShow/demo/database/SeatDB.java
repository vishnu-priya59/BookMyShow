package bookMyShow.demo.database;


import bookMyShow.demo.models.Seat;

import java.util.ArrayList;
import java.util.List;

public class SeatDB {
    private List<Seat> seats;

    public SeatDB() {
        seats = new ArrayList<>();
    }

    public void addSeat(Seat seat) {
        seats.add(seat);
    }

    public List<Seat> getSeats() {
        return seats;
    }
}

