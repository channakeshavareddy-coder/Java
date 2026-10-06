/*
 - Problem
 -
 - Raju has a shopping budget of 100000. He buys a laptop for 55000, adds 5000 to his budget, spends 10000 on accessories, and receives a 5000 refund.
 - Update the budget after each transaction using appropriate assignment operators and print the final budget.
 -
 -         Input
 -
 - No input is required.
 -
 - Output
 -
 - Final Budget: 45000
 -
 - Concept: Assignment operators =, +=, -=, and compound assignment.
 */
public class AssignmentOperators{
    public static void main(String[]args){
        double raju = 100000.0;
        raju -= 55000.0;
        raju += 5000;
        raju -= 10000;
        raju += 5000;
        System.out.println(raju);

    }
}