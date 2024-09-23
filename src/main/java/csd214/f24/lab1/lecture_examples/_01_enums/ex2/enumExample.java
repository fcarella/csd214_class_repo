// see https://www.geeksforgeeks.org/iterating-over-enum-values-in-java/
// see https://stackoverflow.com/questions/38024965/java-enums-as-integers-scanner-and-menu-options
// see https://www.tutorialspoint.com/java/lang/enum_valueof.htm
package csd214.f24.lab1.lecture_examples._01_enums.ex2;

import csd214.f24.lab1.q3.Person;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Scanner;

public class  enumExample {
    public enumExample() throws Person.InvalidSINException, Person.MaxAgeException {
    }

    public enum seasons {
        Spring,
        Summer,
        Monsoon,
        Autumn,
        Winter
    }


    public static void main(String[] args) throws Person.InvalidSINException, Person.MaxAgeException {

        Person p=new Person();

        // Convert enum to set and apply forEach()
        EnumSet.allOf(seasons.class)
                .forEach(season -> System.out.println(season));

        EnumSet.allOf(Person.Gender.class)
                .forEach(gender -> System.out.println(gender));


        // Convert enum to set and apply forEach()
        Arrays.asList(seasons.values())
                .forEach(season -> System.out.println(season));

        Arrays.asList(Person.Gender.values())
                .forEach(gender -> System.out.println(gender));

        Person.Gender x = Person.Gender.values()[0];
        System.out.println("x.name="+x.name());
        System.out.println("x.toString="+x.toString());
        System.out.println("x.ordinal="+x.ordinal());
        System.out.println("x.getClass()="+x.getClass());

        for(Person.Gender g:Person.Gender.values())
            System.out.println("g.toString="+g.toString());

        String s="";
        Scanner in=new Scanner(System.in);
        for(Person.Gender g:Person.Gender.values())
            s+=g+", ";
        System.out.println("Enter 0, 1 or 2 for "+s+" :");
        Person.Gender value = Person.Gender.values()[in.nextInt()];
        System.out.println(value);

        
        

    }
}
