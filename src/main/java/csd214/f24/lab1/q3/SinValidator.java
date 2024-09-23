package csd214.f24.lab1.q3;

public class SinValidator {

    public static void main(String[] args) {
        try {
            setSin("123456789");  // Valid example
            setSin("12345678"); // Uncomment to test an invalid example
        } catch (InvalidSinException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void setSin(String sin) throws InvalidSinException {
        // Regular expression for a positive 9-digit number
        //String regex = "^[1-9]\\d{8}$";
        String regex = "^[0-9]{9}$";

        // Validate the input using the regular expression
        if (!sin.matches(regex)) {
            throw new InvalidSinException("Invalid SIN: " + sin);
        }

        // Process the valid SIN (in this case, just printing it)
        System.out.println("Valid SIN: " + sin);
    }

    // Custom exception class for invalid SIN
    static class InvalidSinException extends Exception {
        public InvalidSinException() {
            super("Invalid SIN:");
        }
        public InvalidSinException(String message) {
            super("Invalid SIN: "+message);
        }
    }
}
