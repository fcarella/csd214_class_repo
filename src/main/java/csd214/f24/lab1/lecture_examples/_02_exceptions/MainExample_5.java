/*
 * An exception is thrown because of an invalid name.
 * The exception is not handled by the app, its thrown back to the console
 *
 */
package csd214.f24.lab1.lecture_examples._02_exceptions;

/**     exception example
 *      See: https://www.baeldung.com/java-checked-unchecked-exceptions
 *      - Person(...) can throw PersonException, InvalidNameException or InvalidAgeException which are subclasses of PersonException
 *          - all of these are checked exceptions
 *      - exceptions ARE handled in main,
 *          - handled by catch which just prints appropriate message
 *      - p1 IS NOT valid, InvalidAgeException thrown
 *      - exception handled in main by the catch clauses, appropriate messages displayed
 * @author Fred
 */
public class MainExample_5 {

    public static void main(String[] args) {
        try {
            Person p1 = new Person();
            p1.setAge(-10);// throws exception
        } catch (Person.InvalidNameException e) {
            System.out.println(e.getMessage()+" thrown");
        } catch (Person.InvalidAgeException e) {
            System.out.println(e.getMessage()+" thrown");
        } catch (Person.PersonException e) {
            System.out.println(e.getMessage()+" thrown");
        }

    }

}
