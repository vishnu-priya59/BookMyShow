package com.bookmyshow.model.theatre;

public class SingleScreen implements TheatreType {
    @Override
    public void showDetails() {
        System.out.println("Single screen classic theatre");
    }
}
