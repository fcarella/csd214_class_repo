/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package csd214.collections;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fcarella
 */
public class Collections {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Collection Interface
        // A collection can be a List or a Set or another collection.
        // here we create an ArrayList collection of objects
        // create a collection object called numbers.  It'll hold numbers, duh
        Collection numbers = new ArrayList();

        // what kind of numbers?  Any kind.
        // create an integer and a double
        Double d = new Double(2.2);
        Integer i = new Integer(2);

        // you can add objects of different types to the collection.
        // an object of a given type is upcasted to an Object, so a collection holds objects of type Object, regardless of what the original type was.
        //
        numbers.add(d);
        numbers.add(i);

        // traversing a collection
        // method 1 using a for each loop
        for (Object number : numbers) {
            System.out.println(number);
        }

        // method 2 using iterators
        Iterator it = numbers.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Set.  Cannot contain duplicates
        Set<String> s = new HashSet<String>();
        if (!s.add("Gille Larock")) {
            System.out.println("Duplicate detected: " + "Gille Larock already added");
        }
        if (!s.add("Noell Hall")) {
            System.out.println("Duplicate detected: " + "Noel Hall already added");
        }
        if (!s.add("Noell Hall")) {
            System.out.println("Duplicate detected: " + "Noel Hall already added");
        }

        System.out.println(s.size() + " distinct words: " + s);

        // Lists
        // create and traverse a list
        List numberList = new ArrayList();
        numberList.add(new Integer(1));
        numberList.add(new Double(4.4));
        // traverse with a for each loop
        for (Object o : numberList) {
            System.out.println(o);
        }

        // traverse with iterators
        it = numberList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // traverse with a for loop
        // List interface supports get()
        for (int k = 0; k < numberList.size(); k++) {
            System.out.println(numberList.get(k));
        }

        // Lists can contain duplicates
        List names = new ArrayList();
        names.add("Noel Hall");
        names.add("Gilles Larock");
        names.add("Gilles Larock");// no error

        // problem!  When we get objects from a collection we need to cast them back to they're original type.
        // use generics
        // namesList can ONLY contain Strings
        List<String> namesList = new ArrayList<String>();
        namesList.add("Noel Hall");
        namesList.add("Gilles Larock");
        namesList.add("Gilles Larock");// no error
        // traverse the list
        for (String ss : namesList) {
            System.out.println(ss);
        }

        //
        List<Double> realNumbers = new ArrayList<Double>();
        realNumbers.add(new Double(3.3));
        // cant add ann integer, get compile error
//        realNumbers.add(new Integer(8));

        // 
        String[] c = {"Joe", "Jim", "Jack", "Jill", "Joe", "Kayleigh"};
        List<String> listOfStrings = new ArrayList<String>(Arrays.asList(c));

        // Set
        String[] names2 = {
            "Joe", "George", "Michael", "James", // some names
            "Joe", "George", "Michael", "James"};// repeat the names
        Set<String> s2 = new HashSet<String>();
        for (String a : names2) {
            s2.add(a);
        }
        // Although there were 8 names added to the set, 4 were duplicates so only 4 are printed out
        System.out.println(s.size() + " distinct words: " + s);

        try {
            // Maps
            Book effectiveJava = new Book("0134685997", "Joshua Bloch", "Effective Java 3rd Edition");
            Book headFirstJava = new Book("0596009208", "Kathy Sierra", "Head First Java, 2nd Edition");
            Book coreJava = new Book("0135166306", "Cay Horstmann", "Core Java Volume I--Fundamentals");

            // create and populate Map.  isbn=key and book is its value
            Map<String, Book> books = new HashMap<String, Book>();
            books.put(coreJava.getIsbn_10(), coreJava);
            books.put(effectiveJava.getIsbn_10(), effectiveJava);
            books.put(headFirstJava.getIsbn_10(), headFirstJava);

            Book b=books.get(effectiveJava.getIsbn_10());
            if(b!=null)
                System.out.println("Found book "+b.getTitle()+" ISBN-10:"+b.getIsbn_10());
            else
                System.out.println("Book not found");
            
            // iterate through every keyvalue pair
            for (Map.Entry<String, Book> e : books.entrySet()) {
                System.out.println("("+e.getKey() + ") : "+ e.getValue());
            }

        } catch (Exception ex) {
            Logger.getLogger(Collections.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
