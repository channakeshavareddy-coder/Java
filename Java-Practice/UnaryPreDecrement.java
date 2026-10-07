/*
 - Requirement:
 - A warehouse system tracks the number of available units of a product.
 - Before processing a customer's order, the system must reduce the available stock by 1 using the pre-decrement operator
 - and then use the updated stock value to determine how many units remain.
 -
 - Initially, the warehouse has 250 units.
 -
 - Input:
 -
 - availableStock = 250
 -
 - Expected Output:
 -
 - Units Remaining: 249
 -
 - Concept: Unary pre-decrement operator --variable
 */
public class UnaryPreDecrement{
    public static void main(String[]args){
        int availableStock = 250; //Available units/stock = 250
        --availableStock;
        System.out.println("Units Remaining: " + availableStock);
    }
}