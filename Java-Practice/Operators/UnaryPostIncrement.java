/*
 - Requirement:
 - Raju has completed 5 tasks today. After completing one more task, update his completed task count using the increment operator ++ and display the total number of completed tasks.
 -
 - Input:
 -
 - tasksCompleted = 5
 -
 - Expected Output:
 -
 - Tasks Completed: 6
 -
 - Concept: Unary increment operator ++
 */
public class UnaryPostIncrement{
    public static void main(String[]args){
        int Raju = 5; // Raju completed 5 tasks.
        Raju ++;
        System.out.println("Tasks Completed: " + Raju);
    }
}