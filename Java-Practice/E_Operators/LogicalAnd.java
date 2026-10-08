/*
 - Problem:
 - keshava has 3 years of experience and a salary of 65000.
 - An employee is eligible for a promotion only if the experience is greater than or equal to 2 years AND the salary is greater than or equal to 50000.
 - Write a Java program to check Raju's eligibility.
 -
 -      Input: No input is required.
 -
 -      Output:
 -
 -      Eligible for Promotion: true
 -
 - Concept: Logical operator && (AND).
 */
public class LogicalAnd {
    public static void main(String[]args){
        int experience = 3;
        double salary = 65000;
        boolean result = experience >= 2 && salary >= 50000.0;
        System.out.println("Eligible for promotion: " + result);
    }
}