package com.bookmyshow.database;
import bookMyShow.demo.models.User;
import java.util.ArrayList;
import java.util.List;

public class UserDB {
    private static List<User> users = new ArrayList<>();

    public synchronized static void registerUser(User user) {
        users.add(user);
        System.out.println("User registered: " + user.getUsername());
    }

    public synchronized static User login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
