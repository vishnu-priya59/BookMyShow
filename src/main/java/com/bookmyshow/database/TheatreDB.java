package com.bookmyshow.database;
import com.bookmyshow.model.theatre.TheatreType;

import java.util.ArrayList;
import java.util.List;

public class TheatreDB {
    private List<TheatreType> theatres;

    public TheatreDB() {
        theatres = new ArrayList<>();
    }

    public void addTheatre(TheatreType theatre) {
        theatres.add(theatre);
    }

    public List<TheatreType> getTheatres() {
        return theatres;
    }
}
