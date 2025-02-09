package com.bookmyshow.model.theatre;

public class TheatreFactory {
    public static TheatreType getTheatre(String theatreType){
        if(theatreType.equalsIgnoreCase("IMAX")){
            return new IMAX();
        } else if (theatreType.equalsIgnoreCase("Multiplex")) {
            return new Multiplex();
        } else if (theatreType.equalsIgnoreCase("SingleScreen")) {
            return new SingleScreen();
        }
        return null;
    }
}
