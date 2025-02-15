package unit_testing.basic;

import static org.junit.jupiter.api.Assertions.*;

import junit_testing.basic.StringUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
    private StringUtils stringUtils;

    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils(); // Initialize before each test
    }

    @Test
    void testReverse() {
        assertEquals("cba", stringUtils.reverse("abc"), "Reversing 'abc' should be 'cba'");
        assertEquals("racecar", stringUtils.reverse("racecar"), "Reversing 'racecar' should be 'racecar'");
        assertNull(stringUtils.reverse(null), "Reversing null should return null");
        assertEquals("", stringUtils.reverse(""), "Reversing an empty string should return an empty string");
    }

    @Test
    void testIsPalindrome() {
        assertTrue(stringUtils.isPalindrome("racecar"), "'racecar' is a palindrome");
        assertTrue(stringUtils.isPalindrome("Madam"), "'Madam' is a palindrome (case insensitive)");
        assertFalse(stringUtils.isPalindrome("hello"), "'hello' is not a palindrome");
        assertFalse(stringUtils.isPalindrome(null), "Null should return false");
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", stringUtils.toUpperCase("hello"), "'hello' should become 'HELLO'");
        assertEquals("JAVA", stringUtils.toUpperCase("java"), "'java' should become 'JAVA'");
        assertNull(stringUtils.toUpperCase(null), "Converting null to uppercase should return null");
        assertEquals("", stringUtils.toUpperCase(""), "Uppercase of an empty string should be an empty string");
    }
}

