package com.bookmyshow.database;
import com.bookmyshow.model.Show;
import java.util.ArrayList;
import java.util.List;

public class ShowDB {
    private List<Show> shows;

    public ShowDB() {
        shows = new ArrayList<>();
    }

    public void addShow(Show show) {
        shows.add(show);
    }

    public List<Show> getShows() {
        return shows;
    }
}

