/*
 - Requirement:
 - An employee is eligible for a performance bonus if their experience is at least 2 years.
 - Write a Java program using an if statement to check Channakeshavareddy G N experience.
 - If he is eligible, display Eligible for Performance Bonus.
 -
 - Input:
 -
 - employeeName = "Channakeshavareddy G N"
 - experience = 3
 -
 - Expected Output:
 -
 - Employee: Channakeshavareddy G N
 - Eligible for Performance Bonus
 -
 - Concept: if statement
 */
public class ifStatement{
    public static void main(String[]args){
        String employeeName = "Channakeshavareddy G N";
        int experience = 3;
        if(experience >= 2){
            System.out.println("Employee: " + employeeName + "\nEligible for Performance Bonus");
        }
    }
}