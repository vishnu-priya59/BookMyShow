package com.bookmyshow.service.notification;

public class User implements Observer {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String displayUser() {
        //System.out.println("Name: "+ name+ "Email: "+ email);

        return "Name: " + name + "Email: " + email;
    }

    @Override
    public void update(String message) {
        System.out.println("Notification to " + name + ": " + message);
    }

    public String getName() {
        return name;
    }
}
