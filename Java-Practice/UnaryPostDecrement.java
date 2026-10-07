/*
 - Requirement:
 - An e-commerce system maintains the number of available seats for a limited-time product launch event.
 - Initially, 500 seats are available. When a customer successfully books a seat, the system must use the post-decrement operator to reduce the available-seat count by 1.
 - Display the number of seats remaining after the booking.
 -
 - Input:
 -
 - availableSeats = 500
 -
 - Expected Output:
 -
 - Seats Remaining: 499
 -
 - Concept: Unary post-decrement operator variable--
 */
public class UnaryPostDecrement{
    public static void main(String[]args){
        int availableSeats = 500;
        int remainingSeats = availableSeats--;
        System.out.println("Seats remaining: " + availableSeats);
    }
}