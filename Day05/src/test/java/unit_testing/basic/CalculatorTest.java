package unit_testing.basic;

import static org.junit.jupiter.api.Assertions.*;

import junit_testing.basic.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator(); // Initialize before each test
    }

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should be 5");
        assertEquals(-1, calculator.add(-2, 1), "-2 + 1 should be -1");
    }

    @Test
    void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2), "3 - 2 should be 1");
        assertEquals(-3, calculator.subtract(2, 5), "2 - 5 should be -3");
    }

    @Test
    void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3), "2 * 3 should be 6");
        assertEquals(0, calculator.multiply(5, 0), "5 * 0 should be 0");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(6, 3), "6 / 3 should be 2");
        assertThrows(ArithmeticException.class, () -> calculator.divide(5, 0), "Division by zero should throw an exception");
    }
}

