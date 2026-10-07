/*
 - Requirement:
 - A company maintains a sequential task ID for every task assigned to an employee. Raju's current task ID is 1045.
 - Before assigning the next task, the system must increase the task ID by 1 using the pre-increment operator
 - and display the newly assigned task ID along with Raju's name.
 -
 - Input:
 -
 - employeeName = "Raju"
 - taskId = 1045
 -
 - Expected Output:
 -
 - Employee: Raju
 - New Task ID: 1046
 -
 - Concept: Unary pre-increment operator ++variable.
 */
public class UnaryPreIncrement{
    public static void main(String[]args){
        String Employee = "Raju";
        int RajuTaskId = 1045;
        int NewTaskId = ++RajuTaskId;
    System.out.println("Employee: " + Employee + "\nNew Task ID: " + NewTaskId);
    }
}