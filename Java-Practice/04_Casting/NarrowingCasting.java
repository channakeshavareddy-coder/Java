/*
 - Requirement: Channa has a product price of 999.99 stored as a double. Convert the price to an int and display the result.
 -
 -       Input: No input required.
 -
 -       Output:  999
 -
 - Concept: Narrowing type casting (double → int).
 */
public class NarrowingCasting{
    public static void main(String[]args){
        double Product = 999.9;
        int temp = (int) Product;
        System.out.println(temp);
    }
}