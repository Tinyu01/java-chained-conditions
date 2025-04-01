package basic;

/**
 * This class focuses specifically on the else statement in Java
 * and demonstrates its proper usage and common patterns.
 */
public class ElseStatement {
    public static void main(String[] args) {
        // Example 1: Basic if-else statement
        System.out.println("Example 1: Basic if-else statement");
        int numberBeingChecked = 5;
        
        if (numberBeingChecked > 5) {
            System.out.println("The number: " + numberBeingChecked + " is > 5");
        } else {
            System.out.println("The number: " + numberBeingChecked + " is <= 5");
        }
        
        // Example 2: if-else with boolean variables
        System.out.println("\nExample 2: if-else with boolean variables");
        boolean isOnline = false;
        
        if (isOnline) {
            System.out.println("User is connected.");
        } else {
            System.out.println("User is offline.");
        }
        
        // Example 3: Common pitfall - semicolon after else
        System.out.println("\nExample 3: Correct way (no semicolon after else)");
        int num = 10;
        
        if (num > 5) {
            System.out.println("Number is greater than 5");
        } else {
            System.out.println("Number is not greater than 5");
        }
        
        // Example 4: Using if-else for assignment
        System.out.println("\nExample 4: Using if-else for assignment");
        int value = 15;
        String result;
        
        if (value % 2 == 0) {
            result = "Even";
        } else {
            result = "Odd";
        }
        System.out.println("The number " + value + " is " + result);
        
        // Example 5: Single line if-else (no braces - not recommended but shown for awareness)
        System.out.println("\nExample 5: Single line if-else (braces are recommended)");
        int hour = 20;
        
        if (hour < 12)
            System.out.println("Good morning!"); // Only this line is controlled by if
        else
            System.out.println("Good day!"); // Only this line is controlled by else
        
        // This line executes regardless of the condition
        System.out.println("This line always executes.");
    }
    
    /**
     * Key points about the else statement:
     * 
     * 1. An else statement cannot exist without an if statement
     * 2. No semicolon should be placed after else
     * 3. The else block executes only when the if condition is false
     * 4. Both if and else can control either a single statement or a block of statements
     * 5. Using curly braces {} is recommended even for single statements
     */
}