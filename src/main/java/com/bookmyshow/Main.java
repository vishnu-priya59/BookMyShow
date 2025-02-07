package com.bookmyshow;


import bookMyShow.demo.models.theatre.Theater;
import com.bookmyshow.service.notification.User;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Register a new user:");
        System.out.print("Username: ");
        String username = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Phone: ");
        String phone = scanner.nextLine();


        User newUser = new User(username, password, email, phone);
        UserDB.registerUser(newUser);
        System.out.println("User registered successfully!");

        // User Login
        System.out.println("\nLogin:");
        System.out.print("Username: ");
        String loginUsername = scanner.nextLine();
        System.out.print("Password: ");
        String loginPassword = scanner.nextLine();

        User loggedInUser = UserDB.login(loginUsername, loginPassword);
        if (loggedInUser != null) {
            System.out.println("Login successful! Welcome, " + loggedInUser.getUsername());


            List<Movie> movies = MovieDB.getMovies();

            System.out.println("\nAvailable Movies:");
            for (Movie movie : movies) {
                System.out.println(movie.getName() + " | Director: " + movie.getDirector() + " | Genre: " + movie.getGenre() + " | Duration: " + movie.getDuration() + " min | Rating: " + movie.getRating() + " | Release date: " + movie.getReleaseDate() + " | Description: " + movie.getDescription());
            }

            // Search for a theater
            TheaterService theaterService = new TheaterService();
            System.out.print("\nEnter theater name to search: ");
            String theaterName = scanner.nextLine();
            Theater foundTheater = theaterService.searchTheater(theaterName);
            if (foundTheater != null) {
                theaterService.displayTheaterDetails(foundTheater);
            } else {
                System.out.println("Theater not found.");
            }

            // For demonstration, select the first movie
            if (!movies.isEmpty()) {
                Movie selectedMovie = movies.get(0);
                // Select the first movie
                Theater imaxTheater = theaterService.createTheater("IMAX", "IMAX 1", "Downtown", null);

                // Create Booking Service
                BookingService bookingService = new BookingService();

                // Create threads for booking tickets
                Runnable bookingTask = () -> {
                    bookingService.bookTickets(imaxTheater, Arrays.asList("IMAX-1", "IMAX-2"), selectedMovie);
                };

                Thread bookingThread1 = new Thread(bookingTask);
                Thread bookingThread2 = new Thread(bookingTask);

                // Start booking threads
                bookingThread1.start();
                bookingThread2.start();

                // Wait for both threads to finish
                try {
                    bookingThread1.join();
                    bookingThread2.join();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Booking interrupted.");
                }

                // Payment Service
                PaymentService paymentService = new PaymentService();
                paymentService.setPaymentStrategy(new UPIPayments()); // Set strategy
                paymentService.executePayment(500.0); // Execute payment

                // Notification Service
                NotificationService notificationService = new NotificationService();
                notificationService.notifyObservers("Booking confirmed for " + selectedMovie.getName() + " at " + imaxTheater.getLocation() + ".");

            } else {
                System.out.println("No movies available.");
            }
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}

