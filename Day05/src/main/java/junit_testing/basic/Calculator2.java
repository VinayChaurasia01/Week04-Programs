package junit_testing.basic;

public class Calculator2 {
    // Method to divide two numbers (throws an exception for division by zero)
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}
