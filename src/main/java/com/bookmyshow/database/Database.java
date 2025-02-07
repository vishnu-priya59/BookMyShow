package com.bookmyshow.database;

public class Database {
    private static Database instance;
    private UserDB userDB;
    private MovieDB movieDB;
    private TheatreDB theatreDB;
    private ShowDB showDB;
    private SeatDB seatDB;
    private BookingDB bookingDB;

    private Database() {
        userDB = new UserDB();
        movieDB = new MovieDB();
        theatreDB = new TheatreDB();
        showDB = new ShowDB();
        seatDB = new SeatDB();
        bookingDB = new BookingDB();
        initializeData(); // Method to populate initial data
    }

    public static Database getInstance() {
        if (instance == null) {
            synchronized (Database.class){
                if(instance==null){
                    instance = new Database();
                }

            }

        }
        return instance;
    }

    public UserDB getUserDB() { return userDB; }
    public MovieDB getMovieDB() { return movieDB; }
    public TheatreDB getTheatreDB() { return theatreDB; }
    public ShowDB getShowDB() { return showDB; }
    public SeatDB getSeatDB() { return seatDB; }
    public BookingDB getBookingDB() { return bookingDB; }

    private void initializeData() {
        // Initialize data for movies, theatres, etc.
    }
}

