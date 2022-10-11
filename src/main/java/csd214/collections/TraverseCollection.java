/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd214.collections;


import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author fcarella
 */
public class TraverseCollection {

    public static void main(String[] args) {
        // 
        String[] names = {"Joe", "Jim", "Jack", "Jill", "Joe", "Kayleigh"};
        List<String> listOfStrings = new ArrayList<String>(java.util.Arrays.asList(names));

        System.out.println("-// traverse method 1 - with index------------------------------");
        for (int i = 0; i < listOfStrings.size(); i++) {
            System.out.println("" + listOfStrings.get(i));
        }
        System.out.println("-// traverse method 2 - with for - each------------------------------");
        for (String name : listOfStrings) {
            System.out.println("" + name);
        }
        System.out.println("-// traverse method 3 - with iterators------------------------------");
        Iterator it = listOfStrings.iterator();
        while (it.hasNext()) {
            System.out.println("" + it.next());
        }
        System.out.println("-// traverse method 3 - with aggregate methods------------------------------");

        Person[] pres = {
            new Person("George W Bush", LocalDate.of(1946, Month.JULY, 6), Person.Sex.MALE, "newsadmin@whitehouse.gov"),
            new Person("Barack Obama", LocalDate.of(1961, Month.AUGUST, 4), Person.Sex.MALE, "newsadmin@whitehouse.gov"),
            new Person("Donald Trump", LocalDate.of(1946, Month.JUNE, 14), Person.Sex.MALE, "newsadmin@whitehouse.gov"),
            new Person("Joe Biden", LocalDate.of(1942, Month.NOVEMBER, 20), Person.Sex.MALE, "newsadmin@whitehouse.gov")
        };

        List<Person> presidents = java.util.Arrays.asList(pres);

        // iterate using for - each
        for (Person president : presidents) {
            System.out.println(president.getName());
        }
        
        // use aggregate operation forEach
        presidents.stream().forEach(e -> System.out.println(e.getName()));

        
        // 
    }

}
