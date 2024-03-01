package StringManipulationTest;

import StringManipulationMain.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TestToUpperCase {

    @Test
    public void TestToUpperCaseToFail() {
        String input = "str";
        String upperCase = StringUtils.toUpperCase(input);
        assertEquals("111", upperCase);
    }

    @Test
    public void testUpperCaseStringWithNullString() {
        String input = null;
        String upperCase = StringUtils.toUpperCase(input);
        assertNull(upperCase);
    }

    @Test
    public void testUpperCaseStringWithEmptyString() {
        String input = "";
        Throwable exception = assertThrows(NullPointerException.class, () -> {
            StringUtils.toUpperCase(input);
        });
        assertEquals("String should not be empty", exception.getMessage());
    }

    @Test
    public void testUpperCaseStringWithValidString() {
        String input = "Hello";
        String upperCase = StringUtils.toUpperCase(input);
        assertEquals("HELLO", upperCase);
    }

    @Test
    public void testUpperCaseStringWithMultipleWords() {
        String input = "Hello World";
        String upperCase = StringUtils.toUpperCase(input);
        assertEquals("HELLO WORLD", upperCase);
    }

    @Test
    public void testUpperCaseStringWithLeadingTrailingWhitespaces() {
        String input = "  Hello  ";
        String upperCase = StringUtils.toUpperCase(input);
        assertEquals("  HELLO  ", upperCase);
    }

}
