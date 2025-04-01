package practical;

/**
 * This class demonstrates how to use nested if-else statements
 * to make decisions based on available money.
 */
public class SpendingDecisions {
    public static void main(String[] args) {
        // Change this value to test different scenarios
        int dollarsToSpareInPocketToday = 15;

        // First implementation style
        System.out.println("Implementation Style 1:");
        if (dollarsToSpareInPocketToday >= 15) {
            System.out.println("I will go to the Movies");
        } else {
            if (dollarsToSpareInPocketToday >= 3) {
                System.out.println("I will go to a Cafe for a cup of coffee.");
            } else {
                System.out.println("I will chill at home.");
            }
        }

        // Second implementation style (reversed conditions)
        System.out.println("\nImplementation Style 2:");
        if (dollarsToSpareInPocketToday < 3) {
            System.out.println("I will chill at home.");
        } else {
            if (dollarsToSpareInPocketToday < 15) {
                System.out.println("I will go to a Cafe for a cup of coffee.");
            } else {
                System.out.println("I will go to the Movies");
            }
        }
    }

    /**
     * Try running this application with different values:
     * 1. dollarsToSpareInPocketToday = 2  (Less than $3)
     * 2. dollarsToSpareInPocketToday = 10 (Between $3 and $15)
     * 3. dollarsToSpareInPocketToday = 20 (More than $15)
     */
}