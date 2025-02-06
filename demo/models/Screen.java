package bookMyShow.demo.models;

import bookMyShow.demo.models.theatre.Theater;
import java.util.List;

public class Screen {
    private String screenId;
    private String screenType;
    private List<Seat> seats;

    public Screen(String screenId, String screenType, List<Seat> seats, List<Theater> theaters) {
        this.screenId = screenId;
        this.screenType = screenType;
        this.seats = seats;
    }

    public String getScreenId() { return screenId; }
    public String getScreenType() { return screenType; }
    public List<Seat> getSeats() { return seats; }
}