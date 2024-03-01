package StringManipulationTest;

import StringManipulationMain.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.Assert.*;

public class TestIsPalindrome {

    @Test
    public void TestIsPalindromeToFail() {
        String input = "aba";
        Boolean isPalindrome = StringUtils.isPalindrome(input);
        assertTrue(isPalindrome);
    }

    @Test
    public void testIsPalindromeStringWithNullString() {
        String input = null;
        Boolean isPalindrome = StringUtils.isPalindrome(input);
        assertNull(isPalindrome);
    }

    @Test
    public void testIsPalindromeStringWithEmptyString() {
        String input = "";
        Throwable exception = assertThrows(NullPointerException.class, () -> {
            StringUtils.isPalindrome(input);
        });
        assertEquals("String should not be empty", exception.getMessage());
    }

    @Test
    public void testIsPalindromeStringWithValidString() {
        String input = "gadag";
        Boolean isPalindrome = StringUtils.isPalindrome(input);
        assertTrue(isPalindrome);
    }

    @Test
    public void testIsPalindromeStringWithInValidString() {
        String input = "harsha";
        Boolean isPalindrome = StringUtils.isPalindrome(input);
        assertFalse(isPalindrome);
    }

    @Test
    public void testIsPalindromeStringWithCaseSensitivityString() {
        String input = "Radar";
        Boolean isPalindrome = StringUtils.isPalindrome(input);
        assertTrue(isPalindrome);
    }

    @Test
    public void testIsPalindromeStringWithMultipleWords() {
        String input = "aba aba";
        Boolean isPalindrome = StringUtils.isPalindrome(input);
        assertTrue(isPalindrome);
    }

    @Test
    public void testIsPalindromeStringWithLeadingTrailingWhitespaces() {
        String input = "  radar  ";
        Boolean isPalindrome = StringUtils.isPalindrome(input);
        assertTrue(isPalindrome);
    }

    @ParameterizedTest
    @ValueSource(strings = { "aba", "gadag", "Radar", "lala", "aba aba", "  radar  " })
    public void testIsPalindromeWithValidInputs(String input) {
        Boolean isPalindrome = StringUtils.isPalindrome(input);
        assertTrue(isPalindrome);
    }

}
