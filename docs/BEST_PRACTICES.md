# Best Practices for Chained Conditions in Java

## Introduction

When working with chained conditions in Java, following good practices can make your code more readable, maintainable, and less prone to errors. This document outlines key recommendations for effectively using if-else chains in your Java programs.

## 1. Limit Nesting Depth

**Recommendation**: Limit nesting to a maximum of 3 levels.

**Why**: Deep nesting creates code that is difficult to read, understand, and maintain.

**Example of code to avoid**:
```java
if (condition1) {
    if (condition2) {
        if (condition3) {
            if (condition4) {
                // This is too deep!
            }
        }
    }
}
```

**Alternative**: 
- Use early returns
- Extract complex conditions into separate methods
- Use alternative control structures like switch statements

## 2. Use Consistent Formatting

**Recommendation**: Follow a consistent style for brace placement and indentation.

**Why**: Consistent formatting improves readability and reduces cognitive load when reading code.

**Good Example**:
```java
if (condition) {
    // Code
} else {
    // Code
}
```

## 3. Use Else-If for Multiple Conditions

**Recommendation**: Use `else if` instead of nested if-else statements for sequential conditions.

**Why**: The `else if` structure is more readable and better represents the logic of mutually exclusive conditions.

**Instead of**:
```java
if (score >= 90) {
    grade = "A";
} else {
    if (score >= 80) {
        grade = "B";
    } else {
        if (score >= 70) {
            grade = "C";
        }
    }
}
```

**Prefer**:
```java
if (score >= 90) {
    grade = "A";
} else if (score >= 80) {
    grade = "B";
} else if (score >= 70) {
    grade = "C";
}
```

## 4. Use Boolean Variables Directly

**Recommendation**: For boolean variables, test them directly rather than comparing to `true` or `false`.

**Why**: Direct testing is more concise and less prone to errors.

**Instead of**:
```java
if (isRaining == true) {
    // Take umbrella
}
```

**Prefer**:
```java
if (isRaining) {
    // Take umbrella
}
```

And similarly:

**Instead of**:
```java
if (isRaining == false) {
    // Leave umbrella
}
```

**Prefer**:
```java
if (!isRaining) {
    // Leave umbrella
}
```

## 5. Consider Refactoring Complex Conditions

**Recommendation**: Extract complex conditions into well-named methods or variables.

**Why**: This improves readability and allows reuse of the condition.

**Instead of**:
```java
if (age >= 18 && income > 30000 && creditScore > 700) {
    // Approve loan
}
```

**Prefer**:
```java
boolean isEligibleForLoan = age >= 18 && income > 30000 && creditScore > 700;

if (isEligibleForLoan) {
    // Approve loan
}
```

Or better yet:
```java
if (isEligibleForLoan(age, income, creditScore)) {
    // Approve loan
}

// Method defined elsewhere
private boolean isEligibleForLoan(int age, double income, int creditScore) {
    return age >= 18 && income > 30000 && creditScore > 700;
}
```

## 6. Add Meaningful Comments

**Recommendation**: Add comments to explain complex logic, but avoid over-commenting obvious code.

**Why**: Good comments explain *why* not *what* and help future developers understand your reasoning.

**Example**:
```java
// Check if user is eligible for premium discount based on loyalty program rules
if (membershipYears > 5 || (purchasesLastYear > 10 && totalSpent > 1000)) {
    applyDiscount(0.15);  // 15% premium member discount
}
```

## 7. Use Guard Clauses for Early Returns

**Recommendation**: Handle edge cases or preconditions early in methods to reduce nesting.

**Why**: This approach reduces nesting and makes the main logic clearer.

**Instead of**:
```java
void processOrder(Order order) {
    if (order != null) {
        if (order.isValid()) {
            if (order.hasItems()) {
                // Process the order
            }
        }
    }
}
```

**Prefer**:
```java
void processOrder(Order order) {
    if (order == null) {
        return;  // or throw exception
    }
    
    if (!order.isValid()) {
        return;  // or throw exception
    }
    
    if (!order.hasItems()) {
        return;  // or throw exception
    }
    
    // Process the order
}
```

## 8. Consider Table-Driven Methods for Complex Conditions

**Recommendation**: For complex combinations of conditions, consider using lookup tables or maps.

**Why**: Table-driven approaches can be clearer than complex nested conditions.

**Example**:
```java
// Define action lookup
Map<String, Runnable> actions = new HashMap<>();
actions.put("highMoneyFun", () -> System.out.println("Go to Las Vegas"));
actions.put("highMoneyHistory", () -> System.out.println("Visit Hoover Dam"));
actions.put("highMoneyNeither", () -> System.out.println("Visit Area 51"));
actions.put("lowMoney", () -> System.out.println("Visit parents"));

// Determine key
String key;
if (money < 300) {
    key = "lowMoney";
} else if (interestedInFun) {
    key = "highMoneyFun";
} else if (interestedInHistory) {
    key = "highMoneyHistory";
} else {
    key = "highMoneyNeither";
}

// Execute action
actions.get(key).run();
```

## 9. Consider Switch Statements for Value-Based Conditions

**Recommendation**: Use switch statements (especially enhanced switch in newer Java versions) for conditions based on discrete values.

**Why**: Switch statements can be more readable for value-based comparisons.

**Example**:
```java
int dayOfWeek = 3;

switch (dayOfWeek) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    // etc.
    default:
        System.out.println("Invalid day");
}
```

In Java 12+, you can use enhanced switch expressions:
```java
String day = switch (dayOfWeek) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    // etc.
    default -> "Invalid day";
};
```

## 10. Test All Branches

**Recommendation**: Write tests that cover all conditional branches in your code.

**Why**: This ensures all paths work as expected and helps identify logical errors.

**Example**:
```java
@Test
void testSpendingDecisions() {
    // Test case 1: Less than $3
    assertEquals("I will chill at home.", getActivity(2));
    
    // Test case 2: Between $3 and $15
    assertEquals("I will go to a Cafe for a cup of coffee.", getActivity(10));
    
    // Test case 3: $15 or more
    assertEquals("I will go to the Movies", getActivity(20));
}
```

## Conclusion

Following these best practices will help you write cleaner, more maintainable code with chained conditions. Remember that readability and maintainability are just as important as functionality when writing professional Java code.
