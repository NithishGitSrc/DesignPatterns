package creational.singleton.example.thread_safe;

/**
 * User class representing a thread attempting to book a ticket.
 */
class User extends Thread {

    /**
     * Constructor for the User thread.
     *
     * @param name The name of the user.
     */
    User(String name) {
        super(name);
    }

    /**
     * Overrides the run method of the Thread class.
     * Attempts to book a ticket using the TicketReservation class.
     * Logs the result using the Logger singleton.
     */
    @Override
    public void run() {
        try {
            // Attempt to book a ticket and log the result.
            if (TicketReservation.bookTicket(this.getName())) {
                // Log successful booking.
                Logger.getInstance().logInfo(this.getName() + " : O Booked! O ");
            } else {
                // Log failed booking (reservation closed).
                Logger.getInstance().logError(this.getName() + " : X Reservation Closed X ");
            }

        } catch (Exception e) {
            // Print stack trace if an exception occurs.
            e.printStackTrace();
        }

    }
}

/**
 * TicketReservation class simulates a ticket reservation system.
 * Demonstrates thread safety using synchronized methods and a volatile variable.
 * Uses the Logger singleton for logging.
 */
public class TicketReservation {

    /**
     * Volatile static variable representing the number of available seats.
     * Volatile ensures visibility across threads.
     */
    static volatile int availableSeats = 4;

    /**
     * Synchronized method to book a ticket.
     * Synchronized ensures that only one thread can access the method at a time.
     *
     * @param name The name of the user booking the ticket.
     * @return true if the ticket is booked successfully, false otherwise.
     */
    public static synchronized boolean bookTicket(String name) {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Main method to simulate ticket reservations by multiple users (threads).
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Array of user names.
        String[] userNames = {"NITHISH", "JOHN", "ALEX", "ELON"};
        int n = userNames.length;
        // Array of User threads.
        User[] users = new User[n];

        // Create and start multiple user threads.
        for (int i = 0; i < n * n; i++) {
            users[i % 4] = new User(userNames[i % 4]);
            users[i % 4].start();
        }

        // Wait for all threads to finish using join().
        for (int i = 0; i < n; i++) {
            try {
                users[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Print a message indicating that all reservations have been processed.
        System.out.println("All reservations processed.");
    }
}