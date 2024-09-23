package csd214.f24.lab1.lecture_examples._02_exceptions;

import java.util.Objects;
import java.util.StringTokenizer;

public class Person {
    private int age;
    private String name;

    public Person() throws PersonException, InvalidNameException, InvalidAgeException {
        setAge(1);
        setName("firstname lastname");
    }

    public Person(String name, int age) throws PersonException {
        setAge(age);
        setName(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws InvalidAgeException {
        if( age <= 0 ) throw new InvalidAgeException();
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws InvalidNameException {
        StringTokenizer tokenizer = new StringTokenizer(name, " ");
        if(tokenizer.countTokens()<2 && tokenizer.countTokens()<10) throw new InvalidNameException();
        this.name = name;
    }


    // NOTE static inner classes can be instantiated without instantiating the parent class
    // Custom exception for invalid person age
    static class InvalidAgeException extends PersonException {
        public InvalidAgeException() {
            super("Invalid Age Exception");
        }
    }

    // Custom exception for invalid person name
    static class InvalidNameException extends PersonException {
        public InvalidNameException() {
            super("Invalid Name Exception");
        }
    }

    // Custom exception for general person-related issues

    // Custom exception for when a person is not found
    static class PersonNotFoundException extends PersonException {
        public PersonNotFoundException() {
            super("Person Not Found Exception");
        }
    }

    // Custom exception for when a person is already registered
    static class PersonAlreadyExistsException extends PersonException {
        public PersonAlreadyExistsException() {
            super("PersonAlready Exists Exception");
        }
    }
    static class PersonException extends Exception {
        public PersonException(String message) {
            super(message);
        }
    }

// Custom exception for other specific person-related issues
// Add more as needed for your specific application

}
