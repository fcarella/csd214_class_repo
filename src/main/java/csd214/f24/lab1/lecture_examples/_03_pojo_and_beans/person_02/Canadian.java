/*
 * to validate SIN See https://stackoverflow.com/questions/20082855/regular-expression-for-canadian-sin-social-insurance-number
 */
package csd214.f24.lab1.lecture_examples._03_pojo_and_beans.person_02;

import java.util.regex.Pattern;

/**
 *
 * @author Fred
 */
public class Canadian extends Nationality {

    private String SIN;
    private static final String msg = "Invalid SIN";

    public Canadian() throws InvalidNationalIdException {
        setNationalId("000000000");
    }

    public Canadian(String SIN) throws InvalidNationalIdException {
        setNationalId(SIN);
    }


    public void setNationalId(String sin) throws InvalidNationalIdException {
        if (!isValidNationalId(sin)) {
            throw new InvalidSINException();
        }
        this.SIN = sin;
    }

    // validate SIN
    @Override
    public boolean isValidNationalId(String id) {
        // SIN must be 9 characters in length and represent a positive 9-digit number
        String regex = "^[0-9]{9}$";
        return Pattern.matches(regex, id);
    }

    public static class InvalidSINException extends InvalidNationalIdException{
        public InvalidSINException() {
            super(msg);
        }
    }

}
