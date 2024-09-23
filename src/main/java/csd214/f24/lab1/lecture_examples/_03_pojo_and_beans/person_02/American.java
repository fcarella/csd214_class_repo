/*
 * to validate SSN See https://ihateregex.io/expr/ssn/
 * Valid SSNS
 *
123-45-6789
123 45 6789
333-22-4444
aaa-bbb-cccc
900-58-4564
999-58-4564
000-45-5454
*
* This expression can be used to find or validate a hyphen-separated Social Security Number (SSN) in the format NNN-NN-NNNN.

An SSN cannot:

Contain all zeroes in any specific group (e.g 000-##-####, ###-00-####, or ###-##-0000)
Begin with 666.
Begin with any value from 900-999.
*
 */
package csd214.f24.lab1.lecture_examples._03_pojo_and_beans.person_02;

import java.util.regex.Pattern;

/**
 *
 * @author Fred
 */
public class American extends Nationality {

    private String SSN;
    private static final String msg = "Invalid SSN";

    public American() throws InvalidNationalIdException {
        setNationalId("123-45-6789");
    }

    public American(String ssn) throws InvalidNationalIdException {
        setNationalId(ssn);
    }


    public void setNationalId(String ssn) throws InvalidNationalIdException {
        if (!isValidNationalId(ssn)) {
            throw new InvalidSSNException();
        }
        this.SSN = ssn;
    }
    // validate SSN
    @Override
    public boolean isValidNationalId(String id) {
        // SIN must be 9 characters in length and represent a positive 9-digit number
        String regex = "^(?!0{3})(?!6{3})[0-8]\\d{2}-(?!0{2})\\d{2}-(?!0{4})\\d{4}$";
        return Pattern.matches(regex, id);
    }

    public static class InvalidSSNException extends InvalidNationalIdException{
        public InvalidSSNException() {
            super(msg);
        }
    }

}
