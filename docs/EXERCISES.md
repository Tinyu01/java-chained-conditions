# Practice Exercises for Chained Conditions in Java

These exercises will help you practice and reinforce your understanding of chained conditions in Java. Each exercise includes a problem description and hints. Try to solve them on your own before looking at the solution!

## Exercise 1: Grade Calculator

**Problem**: Create a program that assigns letter grades based on numerical scores using the following scale:
- 90-100: A
- 80-89: B
- 70-79: C
- 60-69: D
- Below 60: F

Additionally, add a "+" modifier for scores ending in 8 or 9 (except for A which has no A+), and a "-" modifier for scores ending in 0 or 1 (except for F which has no F-).

**Hints**:
- Use nested if-else statements for the main grade categories
- Use the modulo operator (`%`) to check the last digit of the score

## Exercise 2: Customer Discount System

**Problem**: Implement a customer discount system that determines discounts based on:
- Customer type (Regular, Premium, VIP)
- Purchase amount
- Customer membership duration (in years)

Rules:
- Regular customers:
  - No discount for purchases under $100
  - 5% discount for purchases $100-$999
  - 10% discount for purchases $1000 or more
- Premium customers:
  - 10% discount for all purchases
  - Additional 5% if purchase is over $500
  - Additional 2% per year of membership (up to 5 years max)
- VIP customers:
  - 15% discount for all purchases
  - Additional 10% if purchase is over $1000
  - Additional 3% per year of membership (no maximum)

**Hints**:
- Use nested if-else for the customer types
- Use Math.min() to cap the year-based bonuses

## Exercise 3: Weather Activity Recommender

**Problem**: Create a program that recommends activities based on:
- Weather condition (Sunny, Cloudy, Rainy, Snowy)
- Temperature (in Fahrenheit)
- Wind speed (in mph)
- Weekend (yes/no)

Rules for activity recommendations:
- Sunny:
  - Temperature > 80°F: "Go swimming" (if weekend) or "Go for a walk during lunch break" (weekday)
  - Temperature 60-80°F: "Go hiking" (if weekend) or "Eat lunch at the park" (weekday)
  - Temperature < 60°F: "Go for a scenic drive" (if weekend) or "Find a sunny spot to read" (weekday)
- Cloudy:
  - Temperature > 70°F: "Visit a farmers market" (if weekend) or "Take a lunch walk" (weekday)
  - Temperature 50-70°F: "Visit a museum" (if weekend) or "Visit a café" (weekday)
  - Temperature < 50°F: "Movie marathon" (if weekend) or "Visit the library" (weekday)
- Rainy:
  - Wind speed < 10 mph: "Visit a shopping mall" (if weekend) or "Catch up on emails" (weekday)
  - Wind speed >= 10 mph: "Stay home and read" (if weekend) or "Work from home if possible" (weekday)
- Snowy:
  - Temperature > 25°F and wind speed < 15 mph: "Go skiing" (if weekend) or "Take photos of snow during lunch" (weekday)
  - Otherwise: "Stay home with hot cocoa" (if weekend) or "Work from home if possible" (weekday)

**Hints**:
- Use nested if-else statements for the main weather conditions
- Further nest based on temperature, wind speed, and weekend status

## Exercise 4: Loan Eligibility Checker

**Problem**: Implement a loan eligibility checker that determines if a loan application should be:
- Approved
- Conditionally approved (with conditions)
- Denied

Consider the following criteria:
- Credit score (300-850)
- Annual income
- Employment duration (in years)
- Current debt-to-income ratio (percentage)
- Loan amount requested

Rules:
- Approved if:
  - Credit score ≥ 720 AND
  - Income ≥ $40,000 AND
  - Debt-to-income ratio < 30% AND
  - Employment duration ≥ 2 years
- Conditionally approved if:
  - Credit score ≥ 650 AND
  - Income ≥ $30,000 AND
  - Debt-to-income ratio < 40% AND
  - Employment duration ≥ 1 year
  - BUT any of the "Approved" criteria are not met
  - Conditions depend on which criteria were not met
- Denied otherwise

**Hints**:
- Create boolean variables for each criterion
- Use them in nested if-else statements
- For conditional approval, track which specific conditions were not met

## Exercise 5: Shipping Cost Calculator

**Problem**: Create a shipping cost calculator that determines shipping cost based on:
- Destination (Domestic, Canada, International)
- Package weight (in pounds)
- Package dimensions (length, width, height in inches)
- Shipping speed (Standard, Express, Priority)

Rules:
- Calculate dimensional weight: (length × width × height) ÷ 166
- Use the greater of actual weight or dimensional weight
- Domestic:
  - Standard: $5 + $0.50 per pound
  - Express: $10 + $0.75 per pound
  - Priority: $15 + $1.00 per pound
- Canada:
  - Standard: $10 + $0.75 per pound
  - Express: $20 + $1.00 per pound
  - Priority: $30 + $1.25 per pound
- International:
  - Standard: $15 + $1.00 per pound
  - Express: $30 + $1.50 per pound
  - Priority: $45 + $2.00 per pound
- If package weight exceeds 50 pounds, add $25 surcharge
- If sum of dimensions (length + width + height) exceeds 60 inches, add $10 surcharge

**Hints**:
- Calculate the actual and dimensional weights first
- Use nested if-else statements for destination and shipping speed
- Add surcharges at the end if applicable

## Solutions

Try solving the exercises yourself before looking at these solutions!

### Solution 1: Grade Calculator

```java
public class GradeCalculator {
    public static void main(String[] args) {
        int score = 88; // Try different scores
        String grade;
        
        if (score >= 90) {
            if (score % 10 >= 8 && score % 10 <= 9) {
                grade = "A";  // No A+ in our system
            } else if (score % 10 >= 0 && score % 10 <= 1) {
                grade = "A-";
            } else {
                grade = "A";
            }
        } else if (score >= 80) {
            if (score % 10 >= 8 && score % 10 <= 9) {
                grade = "B+";
            } else if (score % 10 >= 0 && score % 10 <= 1) {
                grade = "B-";
            } else {
                grade = "B";
            }
        } else if (score >= 70) {
            if (score % 10 >= 8 && score % 10 <= 9) {
                grade = "C+";
            } else if (score % 10 >= 0 && score % 10 <= 1) {
                grade = "C-";
            } else {
                grade = "C";
            }
        } else if (score >= 60) {
            if (score % 10 >= 8 && score % 10 <= 9) {
                grade = "D+";
            } else if (score % 10 >= 0 && score % 10 <= 1) {
                grade = "D-";
            } else {
                grade = "D";
            }
        } else {
            grade = "F";  // No F- in our system
        }
        
        System.out.println("Score: " + score + ", Grade: " + grade);
    }
}
```

### Solution to Exercise 2-5

Would appear here in the actual document. Try implementing them yourself!
