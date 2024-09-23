/*
 * An exception is thrown because of an invalid age.
 * The exception is not handled by the app, its thrown back to the console
 *
 */
package csd214.f24.lab1.lecture_examples._02_exceptions;

/**     exception example
 *      See: https://www.baeldung.com/java-checked-unchecked-exceptions
 *      - Person(...) can throw InvalidNameException or InvalidAgeException which are subclasses of PersonException
 *          - all of these are checked exceptions
 *      - exceptions ARE NOT handled in main,
 *          - they are thrown back up the hierarchy,
 *          - handled by caller
 *      - p2 IS NOT valid, InvalidAgeException thrown
 *      - main throws Exception (superclass), caller sees InvalidAgeException (subclass) displays InvalidAgeException message
 * @author Fred
 */
public class MainExample_2 {

    public static void main(String[] args) throws Exception {
        Person p1=new Person();
        // invalid age
        Person p2=new Person("Fred Carella", -20);

    }
    
}
