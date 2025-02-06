package bookMyShow.demo.models;

import java.util.ArrayList;
import java.util.List;

public class Seat {
    private String seatNumber;
    private boolean isBooked;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.isBooked = false;
    }

    public static List<Seat> seats = new ArrayList<>();
    public static List<Seat> getSeats() { return seats; }

    public String getSeatNumber() { return seatNumber; }
    public boolean isBooked() { return isBooked; }
    public void bookSeat() { isBooked = true; }
}


