package nested;

/**
 * This class demonstrates nested if-else statements in Java
 * and shows how to handle multiple layers of conditions.
 */
public class NestedIfElse {
    public static void main(String[] args) {
        // Example 1: Basic nested if-else
        System.out.println("Example 1: Basic nested if-else");
        int score = 85;
        
        if (score >= 60) {
            System.out.println("You passed!");
            
            if (score >= 90) {
                System.out.println("You got an A!");
            } else {
                if (score >= 80) {
                    System.out.println("You got a B!");
                } else {
                    if (score >= 70) {
                        System.out.println("You got a C!");
                    } else {
                        System.out.println("You got a D!");
                    }
                }
            }
        } else {
            System.out.println("You failed. You got an F.");
        }
        
        // Example 2: Nested if within if
        System.out.println("\nExample 2: Nested if within if");
        boolean hasMembership = true;
        boolean hasSpecialOffer = true;
        
        if (hasMembership) {
            System.out.println("Welcome member!");
            
            if (hasSpecialOffer) {
                System.out.println("You qualify for a special discount!");
            }
        }
        
        // Example 3: Nested if within else
        System.out.println("\nExample 3: Nested if within else");
        int age = 17;
        boolean isWithParent = true;
        
        if (age >= 18) {
            System.out.println("You can enter the movie alone.");
        } else {
            System.out.println("You are under 18.");
            
            if (isWithParent) {
                System.out.println("But you can enter with a parent.");
            } else {
                System.out.println("You cannot enter the movie.");
            }
        }
        
        // Example 4: Multiple levels of nesting
        System.out.println("\nExample 4: Multiple levels of nesting");
        char gender = 'M';
        int height = 175;
        
        if (gender == 'M') {
            if (height < 160) {
                System.out.println("Short male");
            } else {
                if (height < 180) {
                    System.out.println("Average height male");
                } else {
                    System.out.println("Tall male");
                }
            }
        } else {
            if (height < 150) {
                System.out.println("Short female");
            } else {
                if (height < 170) {
                    System.out.println("Average height female");
                } else {
                    System.out.println("Tall female");
                }
            }
        }
    }
    
    /**
     * Key points about nested if-else statements:
     * 
     * 1. A nested if is an if statement inside another if or else block
     * 2. There is no limit to the nesting depth, but 3 levels is generally considered max for readability
     * 3. Each level of nesting should be indented properly for readability
     * 4. Each nested if can have its own else block
     * 5. The nested if is only evaluated if the outer condition is met
     */
}