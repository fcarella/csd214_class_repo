/*
 * See https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
 */
package csd214.lecture1.passbyvalue;

/**
 *
 * @author students
 */
public class Main {

    public static void main(String[] args) {
        
        // run this in the debugger to see what's going on.

        Dog aDog = new Dog("Max");
        Dog oldDog = aDog;
        oldDog.setName("George");
        aDog.setName("Max");
        // aDog --> [dog object]
        // oldDog --> aDog

        // we pass the object to foo
        // java passes by value, so here, we pass a COPY of the reference to foo, 
        // not the object and not the original reference itself
        foo(aDog);
        // aDog variable is still pointing to the original "Max" dog when foo(...) returns
        aDog.getName().equals("Max"); // true
        aDog.getName().equals("Fifi"); // false
        System.out.println("aDog == oldDog is "+ (aDog == oldDog)); // true
    }

    public static void foo(Dog d) {
        d.setName("Jill");
        System.out.println("d.getName().equals(\"Max\") is "+d.getName().equals("Max")); // true
        d = new Dog("Fifi");
        // change d inside of foo() to point to a new Dog instance "Fifi"
        // NOTE ** on method entry, d refers to the original object.  But d is actually a copy of the
        // original reference so when we modify what d points to below,
        // we modify the COPY not he original.  So the original reference
        // still points to the original dog.
        // So d is Fifi in this method but the original object is still Jill
        System.out.println("d.getName().equals(\"Fifi\") is "+d.getName().equals("Fifi")); // true
    }
}
