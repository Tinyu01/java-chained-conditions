package advanced;

/**
 * This class demonstrates techniques for improving the readability
 * of code with conditional logic and if-else statements.
 */
public class CodeReadability {
    public static void main(String[] args) {
        // Example 1: Poor readability - nested conditions without proper formatting
        System.out.println("Example 1: Poor readability");
        int score = 85; String result;
        if(score>=90){result="A";}else{if(score>=80){result="B";}else{if(score>=70){result="C";}else{if(score>=60){result="D";}else{result="F";}}}}
        System.out.println("Grade: " + result);
        
        // Example 2: Improved readability - proper formatting and indentation
        System.out.println("\nExample 2: Improved readability with formatting");
        score = 85;
        
        if (score >= 90) {
            result = "A";
        } else {
            if (score >= 80) {
                result = "B";
            } else {
                if (score >= 70) {
                    result = "C";
                } else {
                    if (score >= 60) {
                        result = "D";
                    } else {
                        result = "F";
                    }
                }
            }
        }
        System.out.println("Grade: " + result);
        
        // Example 3: Even better - using else-if instead of nested if-else
        System.out.println("\nExample 3: Using else-if for clarity");
        score = 85;
        
        if (score >= 90) {
            result = "A";
        } else if (score >= 80) {
            result = "B";
        } else if (score >= 70) {
            result = "C";
        } else if (score >= 60) {
            result = "D";
        } else {
            result = "F";
        }
        System.out.println("Grade: " + result);
        
        // Example 4: Using meaningful variable names and comments
        System.out.println("\nExample 4: Meaningful variable names and comments");
        int studentScore = 85;
        String letterGrade;
        
        // Determine letter grade based on standard grading scale
        if (studentScore >= 90) {
            letterGrade = "A"; // Excellent
        } else if (studentScore >= 80) {
            letterGrade = "B"; // Good
        } else if (studentScore >= 70) {
            letterGrade = "C"; // Satisfactory
        } else if (studentScore >= 60) {
            letterGrade = "D"; // Needs Improvement
        } else {
            letterGrade = "F"; // Failing
        }
        System.out.println("Letter Grade: " + letterGrade);
        
        // Example 5: Refactoring complex conditions
        System.out.println("\nExample 5: Refactoring complex conditions");
        boolean hasHighCredit = true;
        double income = 75000;
        boolean hasStableJob = true;
        
        // Poor readability with complex condition
        if (hasHighCredit && income > 50000 && hasStableJob) {
            System.out.println("Loan approved (complex condition)");
        }
        
        // Better readability with extracted condition
        boolean isEligibleForLoan = hasHighCredit && income > 50000 && hasStableJob;
        
        if (isEligibleForLoan) {
            System.out.println("Loan approved (extracted condition)");
        }
        
        // Example 6: Early returns to reduce nesting
        System.out.println("\nExample 6: Early returns pattern");
        processApplication(90, 75000, true);
        processApplication(65, 30000, false);
    }
    
    // Example of using early returns to reduce nesting
    private static void processApplication(int creditScore, double income, boolean hasCriminalRecord) {
        System.out.println("\nProcessing application...");
        
        // Poor readability - deeply nested
        if (!hasCriminalRecord) {
            if (creditScore >= 70) {
                if (income >= 40000) {
                    System.out.println("Nested approach: Application approved!");
                } else {
                    System.out.println("Nested approach: Income too low.");
                }
            } else {
                System.out.println("Nested approach: Credit score too low.");
            }
        } else {
            System.out.println("Nested approach: Application rejected due to criminal record.");
        }
        
        // Better readability - early returns
        System.out.println("Processing with early returns approach...");
        
        // Check for automatic rejections first
        if (hasCriminalRecord) {
            System.out.println("Early returns: Application rejected due to criminal record.");
            return;
        }
        
        if (creditScore < 70) {
            System.out.println("Early returns: Credit score too low.");
            return;
        }
        
        if (income < 40000) {
            System.out.println("Early returns: Income too low.");
            return;
        }
        
        System.out.println("Early returns: Application approved!");
    }
    
    /**
     * Key techniques for improving code readability:
     * 
     * 1. Use consistent indentation and formatting
     * 2. Use else-if instead of deeply nested if-else when appropriate
     * 3. Use meaningful variable names and add comments for complex logic
     * 4. Extract complex conditions into boolean variables with descriptive names
     * 5. Consider the "early return" pattern to reduce nesting depth
     * 6. Break down complex decisions into smaller, manageable parts
     * 7. Follow a consistent brace style
     * 8. Be concise but clear - don't sacrifice clarity for brevity
     */
}