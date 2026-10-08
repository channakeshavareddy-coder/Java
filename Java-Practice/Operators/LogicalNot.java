/*
 - Requirement:
 - Raju is currently not on leave.
 - Write a Java program using the logical NOT operator ! to determine whether Raju is available for work.
 -
 -       Input:
 -
 - onLeave = false
 -
 - Expected Output:
 -
 - Available for Work: true
 -
 - Concept: Logical NOT operator !
 */
public class LogicalNot{
    public static void main(String[]args){
        boolean onLeave = false;
        boolean raju = !onLeave;
        System.out.println("Available for Work: " + raju);
    }
}