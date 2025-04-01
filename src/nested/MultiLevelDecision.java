package nested;

/**
 * This class demonstrates multi-level decision making in Java
 * with complex examples showing how to structure nested conditions.
 */
public class MultiLevelDecision {
    public static void main(String[] args) {
        System.out.println("Example 1: Weather activity recommendation system");
        
        // Weather variables
        String weather = "Sunny"; // Can be: Sunny, Cloudy, Rainy, Snowy
        int temperature = 75; // In Fahrenheit
        boolean isWeekend = true;
        
        if (weather.equals("Sunny")) {
            if (temperature > 80) {
                if (isWeekend) {
                    System.out.println("Go to the beach!");
                } else {
                    System.out.println("Find a nice outdoor lunch spot.");
                }
            } else if (temperature > 60) {
                if (isWeekend) {
                    System.out.println("Go hiking in the mountains!");
                } else {
                    System.out.println("Take a walk during your lunch break.");
                }
            } else {
                System.out.println("Enjoy the sunshine but bring a jacket!");
            }
        } else if (weather.equals("Cloudy")) {
            if (temperature > 70) {
                System.out.println("Good day for a picnic in the park.");
            } else {
                System.out.println("Visit a museum or gallery.");
            }
        } else if (weather.equals("Rainy")) {
            System.out.println("Stay indoors with a good book.");
        } else if (weather.equals("Snowy")) {
            if (temperature > 25) {
                if (isWeekend) {
                    System.out.println("Go skiing or snowboarding!");
                } else {
                    System.out.println("Build a snowman after work.");
                }
            } else {
                System.out.println("Stay home and make hot chocolate.");
            }
        } else {
            System.out.println("Weather condition not recognized.");
        }
        
        System.out.println("\nExample 2: Loan approval system");
        
        // Loan applicant variables
        int creditScore = 720;
        double income = 65000;
        int yearsEmployed = 3;
        double loanAmount = 200000;
        
        if (creditScore >= 750) {
            if (income >= 80000) {
                if (yearsEmployed >= 2) {
                    System.out.println("Premium loan approved with lowest interest rate!");
                } else {
                    System.out.println("Premium loan approved with standard interest rate.");
                }
            } else if (income >= 50000) {
                if (loanAmount <= 250000) {
                    System.out.println("Standard loan approved.");
                } else {
                    System.out.println("Loan amount too high for income. Approved for reduced amount.");
                }
            } else {
                System.out.println("Income too low for requested loan amount.");
            }
        } else if (creditScore >= 650) {
            if (income >= 60000 && yearsEmployed >= 1) {
                System.out.println("Standard loan approved with higher interest rate.");
            } else {
                System.out.println("Conditionally approved. Additional documentation required.");
            }
        } else {
            System.out.println("Loan application denied due to credit score.");
        }
        
        System.out.println("\nExample 3: Academic program eligibility");
        
        // Student variables
        double gpa = 3.7;
        int satScore = 1350;
        boolean hasRecommendation = true;
        boolean hasExtraCurricular = true;
        
        if (gpa >= 3.5) {
            if (satScore >= 1400) {
                System.out.println("Eligible for Honors Program and Merit Scholarship!");
            } else if (satScore >= 1200) {
                if (hasRecommendation && hasExtraCurricular) {
                    System.out.println("Eligible for Honors Program.");
                } else {
                    System.out.println("Eligible for Advanced Placement.");
                }
            } else {
                System.out.println("Eligible for Regular Admission with GPA Scholarship.");
            }
        } else if (gpa >= 3.0) {
            if (satScore >= 1300) {
                System.out.println("Eligible for Advanced Placement.");
            } else {
                System.out.println("Regular Admission.");
            }
        } else {
            if (hasRecommendation || satScore >= 1200) {
                System.out.println("Conditional Admission.");
            } else {
                System.out.println("Not eligible for admission.");
            }
        }
    }
    
    /**
     * Key points about multi-level decision making:
     * 
     * 1. Multi-level decisions involve multiple if-else statements nested within each other
     * 2. Each level should represent a logical grouping of related conditions
     * 3. Start with the most important or filtering condition at the outermost level
     * 4. Use clear indentation to show the structure of nested decisions
     * 5. Consider refactoring very deep nesting into separate methods for readability
     * 6. Be careful about the logical flow - make sure all possible cases are handled
     */
}