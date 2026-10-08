/*
 - Requirement:
 - An employee is eligible for a performance bonus if their experience is at least 2 years.
 - Write a Java program using an if-else statement to check Channakeshavareddy G N's experience. If eligible, display Eligible for Performance Bonus; otherwise, display Not Eligible for Performance Bonus.
 -
 - Input:
 -
 - employeeName = "Channakeshavareddy G N"
 - experience = 1
 -
 - Expected Output:
 -
 - Employee: Channakeshavareddy G N
 - Not Eligible for Performance Bonus
 -
 - Concept: if-else statement
 */

public class ifElseStatement{
    public static void main(String[]args){
        String employeeName = "Channakeshavareddy G N";
        int experience = 1;
        if(experience >= 2){
            System.out.println("Employee: " + employeeName + "\nEligible for Performance Bonus");
        } else {
            System.out.println("Employee: " + employeeName + "\nNot Eligible for Performance Bonus");
        }
    }
}