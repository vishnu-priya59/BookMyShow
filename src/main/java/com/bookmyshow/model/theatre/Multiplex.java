package com.bookmyshow.model.theatre;

public class Multiplex implements TheatreType {
    @Override
    public void showDetails() {
        System.out.println("Multiplex theatre with Dolby Sound");
    }
}
