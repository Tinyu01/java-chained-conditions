# Java Chained Conditions Tutorial

## Introduction

Decision-making is a fundamental aspect of programming. In Java, decisions are implemented using conditional statements like `if`, `else`, and `else if`. This tutorial explores how to create complex decision structures using chained conditions.

## Table of Contents

1. [The `else` Statement](#the-else-statement)
2. [Nested If-Else Statements](#nested-if-else-statements)
3. [Multi-Level Decisions](#multi-level-decisions)
4. [Code Formatting for Readability](#code-formatting-for-readability)
5. [Best Practices](#best-practices)
6. [Practical Examples](#practical-examples)

## The `else` Statement

The `else` statement in Java provides an alternative path of execution when the condition in an `if` statement evaluates to `false`.

### Syntax

```java
if (condition) {
    // Code executed when condition is true
} else {
    // Code executed when condition is false
}
```

### Example

```java
public class ElseStatement {
    public static void main(String[] args) {
        int numberBeingChecked = 5;
        
        if (numberBeingChecked > 5) {
            System.out.println("The number: " + numberBeingChecked + " is > 5");
        } else {
            System.out.println("The number: " + numberBeingChecked + " is <= 5");
        }
    }
}
```

**Key Points:**
- The `else` statement cannot exist without an `if` statement
- No semicolon is needed after `else`
- The `else` block executes only when the `if` condition is false

## Nested If-Else Statements

Nested if-else statements occur when an `if` or `else` block contains another `if` statement, creating multiple levels of decisions.

### Syntax

```java
if (condition1) {
    // Code executed when condition1 is true
} else {
    if (condition2) {
        // Code executed when condition1 is false AND condition2 is true
    } else {
        // Code executed when both condition1 and condition2 are false
    }
}
```

### Example: Spending Decisions

```java
public class SpendingDecisions {
    public static void main(String[] args) {
        int dollarsToSpare = 10;
        
        if (dollarsToSpare >= 15) {
            System.out.println("I will go to the Movies");
        } else {
            if (dollarsToSpare >= 3) {
                System.out.println("I will go to a Cafe for a cup of coffee");
            } else {
                System.out.println("I will chill at home");
            }
        }
    }
}
```

## Multi-Level Decisions

Complex decision-making often requires multiple levels of conditions, enabling more sophisticated program behavior.

### Example: Travel Plans

```java
public class TravelPlans {
    public static void main(String[] args) {
        int dollarsToSpare = 500;
        boolean interestedInLuckAndFun = false;
        boolean interestedInHistory = true;
        
        if (dollarsToSpare < 300) {
            System.out.println("I will go to my parents place. No diversions.");
        } else {
            if (interestedInLuckAndFun) {
                System.out.println("I will go to Las Vegas!");
            } else {
                if (interestedInHistory) {
                    System.out.println("I will visit the Hoover Dam!");
                } else {
                    System.out.println("I will visit Area 51!");
                }
            }
        }
    }
}
```

In this example:
- Level 1: Check if enough money is available
- Level 2: Check if interested in gambling/entertainment
- Level 3: Check if interested in history

## Code Formatting for Readability

Proper formatting of if-else chains is crucial for code readability and maintenance.

### Best Practices for Formatting

1. **Consistent Brace Placement**
   ```java
   if (condition) {
       // Code
   } else {
       // Code
   }
   ```

2. **Proper Indentation**
   - Indent each nested level with one tab or 4 spaces
   - Follow a consistent pattern throughout your code

3. **Writing Clean if-else Blocks**
   ```
   Step 1: Write the basic structure
   if (condition) {} 
   
   Step 2: Add line breaks
   if (condition) {
   
   }
   
   Step 3: Position cursor with proper indentation
   if (condition) {
       // Start code here
   }
   ```

## Best Practices

1. **Avoid Deep Nesting**: Generally, avoid nesting more than 3 levels deep to maintain code readability
2. **Use Boolean Expressions Directly**: Instead of `if (condition == true)`, use `if (condition)`
3. **Consider Alternative Approaches**: For complex conditions, consider switch statements or other patterns
4. **Add Comments**: For complex decision chains, add comments explaining the logic
5. **Use Proper Indentation**: Each level should be properly indented for readability

## Practical Examples

### Example 1: Grade Calculator

```java
public class GradeCalculator {
    public static void main(String[] args) {
        int score = 85;
        
        if (score >= 90) {
            System.out.println("Grade: A");
        } else {
            if (score >= 80) {
                System.out.println("Grade: B");
            } else {
                if (score >= 70) {
                    System.out.println("Grade: C");
                } else {
                    if (score >= 60) {
                        System.out.println("Grade: D");
                    } else {
                        System.out.println("Grade: F");
                    }
                }
            }
        }
    }
}
```

### Example 2: Weather Activity Selector

```java
public class WeatherActivity {
    public static void main(String[] args) {
        boolean isRaining = false;
        int temperature = 75;
        
        if (isRaining) {
            if (temperature > 70) {
                System.out.println("Visit an indoor museum");
            } else {
                System.out.println("Stay home and read a book");
            }
        } else {
            if (temperature > 80) {
                System.out.println("Go to the beach");
            } else {
                if (temperature > 60) {
                    System.out.println("Go for a hike");
                } else {
                    System.out.println("Go to a cafe");
                }
            }
        }
    }
}
```

## Conclusion

Chained conditions in Java enable complex decision-making in your programs. By properly nesting if-else statements, you can create sophisticated logic that handles multiple scenarios. Remember to maintain code readability with proper formatting and avoid excessive nesting to keep your code maintainable.
