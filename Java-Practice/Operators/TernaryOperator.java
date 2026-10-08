/*
 - Requirement:
 - An online shopping system gives free delivery to customers whose order amount is ₹1,000 or more.
 - Otherwise, a ₹50 delivery charge is applied.
 - Write a Java program using the ternary operator to determine the delivery charge for Raju's order and display the result.
 -
 - Input:
 -
 - orderAmount = 1250.0
 -
 - Expected Output:
 -
 - Delivery Charge: 0.0
 -
 - Concept: Ternary operator condition ? value1 : value2
 */
public class TernaryOperator{
    public static void main(String[]args){
        double orderAmount = 1250.0;
        double deliveryCharge = 50.0;
        double result = (orderAmount >= 1000.0)?0:deliveryCharge;
        System.out.println("Delivery Charge: " + result);
    }
}