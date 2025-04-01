package practical;

/**
 * This class demonstrates multi-level decision making
 * using nested if-else statements for travel planning.
 */
public class TravelPlans {
    public static void main(String[] args) {
        // Change these values to test different scenarios
        int dollarsToSpareInPocketToday = 500;
        boolean interestedInLuckAndFun = false;
        boolean interestedInHistory = true;

        // 1st level "if" condition
        if (dollarsToSpareInPocketToday < 300) {
            System.out.println("I will go to my parents place. No diversions.");
        } else {
            // corresponding "else" body or area of control of 1st "if"
            
            // 2nd level "if" condition
            if (interestedInLuckAndFun) {
                System.out.println("I will go to Las Vegas!");
            } else {
                // corresponding "else" body or area of control of 2nd "if"
                
                // 3rd level "if" condition
                if (interestedInHistory) {
                    System.out.println("I will visit the Hoover Dam!");
                } else {
                    // corresponding "else" body or area of control of 3rd "if"
                    System.out.println("I will visit Area 51!");
                }
            }
        }
    }

    /**
     * Try running this application with different combinations:
     * 
     * Scenario 1: dollarsToSpareInPocketToday = 200
     * Result: "I will go to my parents place. No diversions."
     * 
     * Scenario 2: dollarsToSpareInPocketToday = 300, interestedInLuckAndFun = true
     * Result: "I will go to Las Vegas!"
     * 
     * Scenario 3: dollarsToSpareInPocketToday = 300, interestedInLuckAndFun = false, interestedInHistory = true
     * Result: "I will visit the Hoover Dam!"
     * 
     * Scenario 4: dollarsToSpareInPocketToday = 300, interestedInLuckAndFun = false, interestedInHistory = false
     * Result: "I will visit Area 51!"
     */
}