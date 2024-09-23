/*
 * An exception is thrown because of an invalid name.
 * The exception is not handled by the app, its thrown back to the console
 *
 */
package csd214.f24.lab1.lecture_examples._02_exceptions;

/**     exception example
 *      See: https://www.baeldung.com/java-checked-unchecked-exceptions
 *      - Person(...) can throw InvalidNameException or InvalidAgeException which are subclasses of PersonException
 *          - all of these are checked exceptions
 *      - PersonExceptions ARE handled in main,
 *          - handled by catch which just throws a RuntimeException (an unchecked exception,
 *            so no "throws" required in the method declaration)
 *      - p2 IS NOT valid, InvalidNameException thrown
 *      - catch() throws RuntimeException, caller sees InvalidNameException (subclass) displays InvalidNameException message
 * @author Fred
 */
public class MainExample_4 {

    public static void main(String[] args) {
        try {
            Person p1 = new Person();
            // invalid name
            Person p2 = new Person("Fred", 20);
        } catch (Person.PersonException e) { // catch any exception
            throw new RuntimeException(e);
        }

    }

}
