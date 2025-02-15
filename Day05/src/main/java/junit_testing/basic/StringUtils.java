package junit_testing.basic;

public class StringUtils {
    // Method to reverse a string
    public String reverse(String str) {
        if (str == null) return null; // Handling null case
        return new StringBuilder(str).reverse().toString();
    }

    // Method to check if a string is a palindrome
    public boolean isPalindrome(String str) {
        if (str == null) return false; // Null strings are not palindromes
        String reversed = reverse(str);
        return str.equalsIgnoreCase(reversed); // Case-insensitive comparison
    }

    // Method to convert a string to uppercase
    public String toUpperCase(String str) {
        if (str == null) return null; // Handling null case
        return str.toUpperCase();
    }
}

