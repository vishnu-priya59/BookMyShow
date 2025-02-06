package bookMyShow.demo;

import bookMyShow.demo.models.theatre.Theater;
import bookMyShow.demo.models.*;
import bookMyShow.demo.database.*;
import bookMyShow.demo.service.booking.BookingService;
import bookMyShow.demo.service.notification.NotificationService;
import bookMyShow.demo.service.payment.*;
import bookMyShow.demo.service.theatre.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Register a new user:");
        String username;
        while (true) {
            System.out.print("Username (at least 3 characters): ");
            username = scanner.nextLine().trim();
            if (username.length() >= 3) break;
            System.out.println("Invalid username! It must have at least 3 characters.");
        }

        String password;
        do {
            System.out.print("Password: ");
            password = scanner.nextLine();
        } while (password.length() < 6);

        String email;
        do {
            System.out.print("Email: ");
            email = scanner.nextLine().trim();
        } while (!email.contains("@") || !email.contains("."));


        String phone;
        do {
            System.out.print("Phone: ");
            phone = scanner.nextLine().trim();
        } while (!phone.matches("\\d{10}"));

        System.out.println("User registered successfully!");
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
                System.out.println(movie.getName() + " | Director: " + movie.getDirector() + " | Genre: " + movie.getGenre() + " | Duration: " + movie.getDuration() + " min | Rating: " + movie.getRating()+ " | Release date: "+movie.getReleaseDate()+" | Description: "+movie.getDescription());
            }

            // Search for a theater
            TheaterService theaterService = new TheaterService();
            System.out.print("\nEnter theater name to search: ");
            Theater imaxTheater = theaterService.createTheater("IMAX", "IMAX 1", "Downtown", null);
            String theaterName = scanner.nextLine();
            Theater foundTheater = theaterService.searchTheater(theaterName);
            if (foundTheater != null) {
                theaterService.displayTheaterDetails(foundTheater);
            } else {
                System.out.println("Theater not found.");
                return;
            }


            if (!movies.isEmpty()) {
                Movie selectedMovie = movies.get(7);

                // Create Booking Service
                BookingService bookingService = new BookingService();

                Runnable bookingTask = () -> {
                    bookingService.bookTickets(imaxTheater, Arrays.asList("SEAT-1","SEAT-2"), selectedMovie);
                };

                Thread bookingThread1 = new Thread(bookingTask);

                // Start booking threads
                try {
                    bookingThread1.start();
                } catch (Exception e) {
                    Thread.currentThread().interrupt();
                    System.out.println("Booking interrupted.");
                }

                // Payment Service
                System.out.print("Enter the amount to pay: ");
                double amount = scanner.nextDouble();
                PaymentService paymentService = new PaymentService();
                paymentService.setPaymentStrategy(new UPIPayments());
                paymentService.executePayment(amount);

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

