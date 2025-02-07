package com.bookmyshow.database;

import java.util.ArrayList;
import java.util.List;

public class BookingDB {
    private static List<String> bookings = new ArrayList<>();

    public static void addBooking(String booking) {
        bookings.add(booking);
    }

    public static List<String> getBookings() {
        return bookings;
    }
}
