/*
 - Practical: else-if Ladder
 -
 - Requirement:
 - A company evaluates an employee's performance based on their performance score.
 - Write a Java program using an else-if ladder to determine the employee's performance level.
 -
 - Rules:
 -
 - Score 90 or above → Excellent
 - Score 75 to 89 → Good
 - Score 60 to 74 → Average
 - Score below 60 → Needs Improvement
 -
 - Input:
 -
 - employeeName = "Channakeshavareddy G N"
 - score = 82
 -
 - Expected Output:
 -
 - Employee: Channakeshavareddy G N
 - Performance: Good
 -
 - Concept: else-if ladder
 */
package Java.F_ControlStatements;
public class ElseIfLadder{
    public static void main(String[]args){
        String employeeName = "Channakeshavareddy G N";
        int Score = 89;
        if(Score >= 90){
            System.out.println("Employee: "+ employeeName + "\nPerformance: Excellent");
        } else if(Score > 74 && Score < 90){
            System.out.println("Employee: "+employeeName+"\nPerformance: Good");
        } else if(Score > 59 && Score < 75){
            System.out.println("Employee: " + employeeName + "\nPerformance: Average");
        } else if(Score < 60){
            System.out.println("Employee: "+ employeeName +"\nPerformance: Needs Improvement");
        }
    }
}