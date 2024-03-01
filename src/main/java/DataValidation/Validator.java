package DataValidation;

public class Validator {
    
    String EMAIL_PATTERN = "[a-z0-9]+@gmail.com$";
    String PHONE_NUMBER_PATTERN = "[0-9]{10}";
    String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";

    public Boolean isValidEmail(String email) {
        return email.matches(EMAIL_PATTERN);
    }

    public Boolean isValidPhoneNumber(String phNumber) {
        return phNumber.matches(PHONE_NUMBER_PATTERN);
    }

    public Boolean isValidPassword(String password) {
        return password.matches(PASSWORD_PATTERN);
    }
}
