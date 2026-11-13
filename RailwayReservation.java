
import java.util.Scanner;

// Custom Exception
class SeatAlreadyBookedException extends Exception {
    SeatAlreadyBookedException(String message) {
        super(message);
    }
}

// Reservation Class
class Reservation {
    boolean seats[];

    Reservation(int totalSeats) {
        seats = new boolean[totalSeats];
    }

    void reserveSeat(int seatNumber)
            throws SeatAlreadyBookedException {

        if (seatNumber < 1 || seatNumber > seats.length) {
            throw new IllegalArgumentException(
                "Invalid seat number!"
            );
        }

        if (seats[seatNumber - 1]) {
            throw new SeatAlreadyBookedException(
                "Seat is already booked!"
            );
        }

        seats[seatNumber - 1] = true;

        System.out.println("Seat reserved successfully!");
        System.out.println("Reserved Seat Number: " + seatNumber);
    }
}

// Main Class
public class RailwayReservation {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        Reservation r = new Reservation(10);

        try {
            System.out.print("Enter seat number (1-10): ");

            String input = sc.nextLine();

            int seatNumber = Integer.parseInt(input);

            r.reserveSeat(seatNumber);
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer!");
        }

        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        catch (SeatAlreadyBookedException e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Transaction completed.");
            sc.close();
        }
    }
}
