package csd214.f24.lab1.lecture_examples._01_enums.ex1;

import java.util.Scanner;

public class Main {
    // A simple enum.
    // Level is an enum type, with predefined constants LOW, MEDIUM and HIGH
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }
    // Gender is an enum type
    public enum Gender{
        // these are enum constants.  They call the constructor, passing it
        // a String which will be used as the "longName" of the constant
        // longName is just a field in the enum, just like a field in any other class
        M("Male"), F("Female"), O("Other"), Q("Quit");
        //an enum body can contain methods and fields just like any other class
        private String longName;
        // enums can have constructors
        Gender(String gender) {
            longName =gender;
        }
    }
    public static void main(String[] args) {
        for (Gender g : Gender.values()) {
            System.out.printf("Gender %s long name is %s\n",
                   g.name(), g.longName );
        }
        System.out.println(Gender.valueOf("M").name());
        System.out.println(Gender.M);
        System.out.println(Gender.M.longName);

        {
            Gender g = Gender.O;
            switch (g) {
                case O:
                    System.out.println(Gender.O + ":" + Gender.O.longName);
                    break;
            }
        }

        {
            Level myVar = Level.LOW;
            switch (myVar) {
                case LOW:
                    System.out.println("Low level");
                    break;
            }
        }

        {
            Scanner in=new Scanner(System.in);
            System.out.print("Enter the Gender ");
            for (Gender g : Gender.values())
                System.out.print(g+"("+g.longName+"),");
            System.out.println(":");

            Gender g;
            while(true) {
                // get keyboard input
                try {
                    g = Gender.valueOf(in.nextLine().toUpperCase());
                }catch(Exception e){
                    System.out.println("Try again");
                    continue;
                }
                break;
            }
            System.out.println(g + ":" + g.longName);
            switch (g) {
                case M:
                    System.out.println("You chose M or Male");
                    break;
                case O:
                    System.out.println("You chose O or Other");
                    break;
                case F:
                    System.out.println("You chose F or Female");
                    break;
            }
        }

        {

        }
    }
}
