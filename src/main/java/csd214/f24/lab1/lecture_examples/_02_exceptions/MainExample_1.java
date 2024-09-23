/*
 * Simplest example, no exptions are thrown and if they were they are not handled by the app
 */
package csd214.f24.lab1.lecture_examples._02_exceptions;

/**     exception example
 *      See: https://www.baeldung.com/java-checked-unchecked-exceptions
 *      - Person(...) can throw PersonException, InvalidNameException or InvalidAgeException which are subclasses of PersonException
 *          - all of these are checked exceptions
 *      - exceptions ARE NOT handled in main,
 *          - they are thrown back up the hierarchy,
 *          - handled by caller
 *      - p1, p2 valid, no exceptions thrown
 * @author Fred
 */
public class MainExample_1 {

    public static void main(String[] args) throws Exception {
        Person p1=new Person();
        Person p2=new Person("Fred Carella", 20);

    }
    
}
