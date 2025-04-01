package basic;

/**
 * This class demonstrates basic if-else statements in Java
 * with simple examples to understand the core concepts.
 */
public class SimpleIfElse {
    public static void main(String[] args) {
        // Example 1: Simple if statement
        System.out.println("Example 1: Simple if statement");
        int age = 20;
        
        if (age >= 18) {
            System.out.println("You are an adult.");
        }
        
        // Example 2: if-else statement
        System.out.println("\nExample 2: if-else statement");
        int temperature = 25;
        
        if (temperature > 30) {
            System.out.println("It's hot today!");
        } else {
            System.out.println("It's not too hot today.");
        }
        
        // Example 3: Multiple independent if statements
        System.out.println("\nExample 3: Multiple independent if statements");
        int score = 85;
        
        if (score > 80) {
            System.out.println("Excellent score!");
        }
        
        if (score > 70) {
            System.out.println("Good score!");
        }
        
        if (score > 60) {
            System.out.println("Passing score!");
        }
        
        // Example 4: if-else with boolean variables
        System.out.println("\nExample 4: if-else with boolean variables");
        boolean isRaining = true;
        
        if (isRaining) {
            System.out.println("Take an umbrella.");
        } else {
            System.out.println("No need for an umbrella.");
        }
        
        // Example 5: Using logical operators in conditions
        System.out.println("\nExample 5: Using logical operators in conditions");
        int money = 100;
        boolean isHoliday = false;
        
        if (money > 50 && !isHoliday) {
            System.out.println("Go shopping!");
        } else {
            System.out.println("Stay home and save money.");
        }
    }
    
    /**
     * Key points about if-else statements:
     * 
     * 1. The condition inside if() must evaluate to a boolean value (true/false)
     * 2. No semicolon after the condition: if (condition) not if (condition);
     * 3. For single statements, curly braces {} are optional but recommended
     * 4. else must be paired with an if statement
     * 5. The else block executes only when the if condition is false
     */
}