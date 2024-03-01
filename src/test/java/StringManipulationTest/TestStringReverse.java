package StringManipulationTest;

import StringManipulationMain.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TestStringReverse {

    @Test
    public void testReverseStringWithNullString() {
        String input = null;
        String reversed = StringUtils.reverseString(input);
        assertNull(reversed);
    }

    @Test
    public void testReverseStringWithEmptyString() {
        String input = "";
        Throwable exception = assertThrows(NullPointerException.class, () -> {
            StringUtils.reverseString(input);
        });
        assertEquals("String should not be empty", exception.getMessage());
    }

    @Test
    public void testReverseStringWithValidString() {
        String input = "Hello";
        String reversed = StringUtils.reverseString(input);
        assertEquals("olleH", reversed);
    }

    @Test
    public void testReverseStringWithMultipleWords() {
        String input = "Hello World";
        String reversed = StringUtils.reverseString(input);
        assertEquals("dlroW olleH", reversed);
    }

    @Test
    public void testReverseStringWithLeadingTrailingWhitespaces() {
        String input = "  Hello  ";
        String reversed = StringUtils.reverseString(input);
        assertEquals("  olleH  ", reversed);
    }
}
