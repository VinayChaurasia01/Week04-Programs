package unit_testing.basic;

import static org.junit.jupiter.api.Assertions.*;

import junit_testing.basic.Calculator;
import junit_testing.basic.Calculator2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Calculator2Test {
    private Calculator2 calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator2(); // Initialize before each test
    }

    @Test
    void testDivide_ValidInput() {
        assertEquals(5, calculator.divide(10, 2), "10 / 2 should be 5");
        assertEquals(-3, calculator.divide(-9, 3), "-9 / 3 should be -3");
        assertEquals(0, calculator.divide(0, 5), "0 / 5 should be 0");
    }

    @Test
    void testDivide_ByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
        assertEquals("Cannot divide by zero", exception.getMessage(), "Exception message should match");
    }
}

