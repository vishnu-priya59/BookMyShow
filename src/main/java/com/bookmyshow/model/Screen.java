package com.bookmyshow.model;

import com.bookmyshow.model.theatre.Theater;
import java.util.List;

public class Screen {
    private String screenId;
    private String screenType; // IMAX, 4DX, etc.
    private List<Seat> seats;

    public Screen(String screenId, String screenType, List<Seat> seats, List<Theater> theaters) {
        this.screenId = screenId;
        this.screenType = screenType;
        this.seats = seats;
    }

    // Getters
    public String getScreenId() { return screenId; }
    public String getScreenType() { return screenType; }
    public List<Seat> getSeats() { return seats; }
}