package bookMyShow.demo.database;
import bookMyShow.demo.models.theatre.Theatre;

import java.util.ArrayList;
import java.util.List;

public class TheatreDB {
    private List<Theatre> theatres;

    public TheatreDB() {
        theatres = new ArrayList<>();
    }

    public void addTheatre(Theatre theatre) {
        theatres.add(theatre);
    }

    public List<Theatre> getTheatres() {
        return theatres;
    }
}
