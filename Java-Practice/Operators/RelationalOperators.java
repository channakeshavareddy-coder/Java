/*
 - Raju earns 65000 and Ravi earns 55000. Write a Java program to compare their salaries using relational operators and determine whether Raju's salary is greater than, less than, or equal to Ravi's salary.
 -
 - Input
 -
 - No input is required.
 -
 - Output
 -
 - Raju salary is greater than Ravi salary: true
 - Raju salary is less than Ravi salary: false
 - Raju salary is equal to Ravi salary: false
 -
 - Concept: Relational operators >, <, and ==.
 */
public class RelationalOperators{
    public static void main(String[]args){
        double Raju = 65000.0;
        double Ravi = 55000.0;
        System.out.println("Raju salary is greater than Ravi salary: " + (Raju > Ravi));
        System.out.println("Raju salary is less than Ravi salary: " + (Raju < Ravi));
        System.out.println("Raju salary is equal to Ravi salary: " + (Raju == Ravi));
    }
}