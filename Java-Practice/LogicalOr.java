/*
 - Requirement:
 - Raju can access the company system if he is an admin OR if he is an employee.
 - Write a Java program using the logical OR operator || to check whether Raju has access.
 -
 - Input:
 -
 - isAdmin = false
 - isEmployee = true
 -
 - Expected Output:
 -
 - System Access: true
 -
 - Concept: Logical OR operator ||
 */
public class LogicalOr{
    public static void main(String[]args){
        boolean isAdmin = false;
        boolean isEmployee = true;

        boolean result = isAdmin || isEmployee;
        System.out.println("System Access: " + result);
    }
}