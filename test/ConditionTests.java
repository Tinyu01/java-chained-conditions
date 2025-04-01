package test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class contains JUnit tests to validate the examples
 * and ensure they work as expected.
 * 
 * Note: To run these tests, you need JUnit library in your classpath.
 */
public class ConditionTests {
    
    @Test
    public void testSimpleIfElse() {
        // Test the behavior of a simple if-else statement
        int number = 10;
        String result;
        
        if (number > 5) {
            result = "Greater than 5";
        } else {
            result = "Not greater than 5";
        }
        
        assertEquals("Greater than 5", result);
        
        // Test with a different value
        number = 3;
        
        if (number > 5) {
            result = "Greater than 5";
        } else {
            result = "Not greater than 5";
        }
        
        assertEquals("Not greater than 5", result);
    }
    
    @Test
    public void testNestedIfElse() {
        // Test nested if-else for grade determination
        int score = 85;
        String grade;
        
        if (score >= 90) {
            grade = "A";
        } else {
            if (score >= 80) {
                grade = "B";
            } else {
                if (score >= 70) {
                    grade = "C";
                } else {
                    if (score >= 60) {
                        grade = "D";
                    } else {
                        grade = "F";
                    }
                }
            }
        }
        
        assertEquals("B", grade);
    }
    
    @Test
    public void testElseIf() {
        // Test else-if for grade determination
        int score = 75;
        String grade;
        
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
        
        assertEquals("C", grade);
    }
    
    @Test
    public void testSpendingDecisions() {
        // Test spending decisions example
        assertEquals("Stay home", getActivityBasedOnMoney(2));
        assertEquals("Go for coffee", getActivityBasedOnMoney(10));
        assertEquals("Go to movies", getActivityBasedOnMoney(20));
    }
    
    @Test
    public void testTravelPlans() {
        // Test travel plans example
        assertEquals("Visit parents", getTravelPlan(200, false, false));
        assertEquals("Las Vegas", getTravelPlan(500, true, false));
        assertEquals("Hoover Dam", getTravelPlan(500, false, true));
        assertEquals("Area 51", getTravelPlan(500, false, false));
    }
    
    @Test
    public void testBooleanConditions() {
        // Test boolean conditions
        assertTrue(isEligibleForLoan(720, 60000, 3));
        assertFalse(isEligibleForLoan(600, 60000, 3));
        assertFalse(isEligibleForLoan(720, 20000, 3));
        assertFalse(isEligibleForLoan(720, 60000, 0));
    }
    
    // Helper methods for tests
    
    private String getActivityBasedOnMoney(int money) {
        if (money < 3) {
            return "Stay home";
        } else if (money < 15) {
            return "Go for coffee";
        } else {
            return "Go to movies";
        }
    }
    
    private String getTravelPlan(int money, boolean interestedInFun, boolean interestedInHistory) {
        if (money < 300) {
            return "Visit parents";
        } else {
            if (interestedInFun) {
                return "Las Vegas";
            } else {
                if (interestedInHistory) {
                    return "Hoover Dam";
                } else {
                    return "Area 51";
                }
            }
        }
    }
    
    private boolean isEligibleForLoan(int creditScore, double income, int yearsEmployed) {
        return creditScore >= 700 && income >= 50000 && yearsEmployed >= 2;
    }
}