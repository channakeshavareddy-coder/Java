/*
 - Requirement: Raju bought 2 laptops at ₹55,000 each and received a ₹5,000 discount. Calculate and display the total amount after discount.
 -
 - Output:
 -
 - Total: 105000
 -
 - Concept: Arithmetic operators *, -, and +.
 */
public class ArithmeticOperators{
    public static void main(String[]args){
        double laptop1 = 55000.0 * 2;
        double discount = 5000;
        double finalPrice = laptop1 - 5000;
        System.out.println("Total: " + finalPrice);
    }
}