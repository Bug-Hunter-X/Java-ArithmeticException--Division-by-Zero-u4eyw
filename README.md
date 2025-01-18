# Java ArithmeticException: Division by Zero

This repository demonstrates a common Java error: the `ArithmeticException` caused by division by zero.  The `Bug.java` file contains the erroneous code, while `BugSolution.java` provides a corrected version.

The bug is simple but often overlooked. It highlights the importance of input validation and defensive programming to prevent runtime exceptions.

## How to reproduce the bug

1. Compile `Bug.java` using a Java compiler (e.g., `javac Bug.java`).
2. Run the compiled code (e.g., `java Bug`).
3. Observe the `ArithmeticException` being thrown.

## How to solve the bug

Refer to `BugSolution.java` for a solution that prevents the division by zero. The solution implements a simple check to ensure the denominator is not zero before performing the division.