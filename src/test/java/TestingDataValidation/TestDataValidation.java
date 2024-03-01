package TestingDataValidation;

import DataValidation.Validator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

public class TestDataValidation {

    Validator validator;

    @BeforeEach
    public void setup() {
        validator = new Validator();
    }

    @Test
    public void testInValidEmail() {
        String email = "xyz";
        assertFalse(validator.isValidEmail(email));
    }

    @Test
    public void testValidEmail() {
        assertTrue(validator.isValidEmail("hj933441@gmail.com"));
    }

    @Test
    public void testInValidPhoneNumber() {
        assertFalse(validator.isValidPhoneNumber("11223"));
    }

    @Test
    public void testValidPhoneNumber() {
        assertTrue(validator.isValidPhoneNumber("1122334455"));
    }

    @Test
    public void testInValidPassword() {
        assertFalse(validator.isValidPassword("abc"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(validator.isValidPassword("Abcd@123"));
    }

}
