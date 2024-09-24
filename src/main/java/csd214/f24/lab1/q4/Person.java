package csd214.f24.lab1.q4;

import java.util.Objects;
import java.util.regex.Pattern;

public class Person {
    private String firstName;
    private String lastName;
    private String sin;
    private Gender gender;
    private int age;


    // Class variable
    public static final int MAX_ALLOWABLE_AGE = 120;

    // Enum for gender
    public enum Gender{

        M("Male"), F("Female"), O("Other"); //, Q("Quit");

        public String getLongName() {
            return longName;
        }

        public void setLongName(String longName) {
            this.longName = longName;
        }

        private String longName;
        Gender(String longName) {
            this.longName =longName;
        }
    }


    public Person()  throws InvalidSINException, MaxAgeException {
        firstName="firstname";
        lastName="lastname";
        setSin("000000000");
        gender= Gender.O;
        setAge(0);
    }

    public Person(String firstName, String lastName) throws InvalidSINException, MaxAgeException {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String sin) throws InvalidSINException, MaxAgeException {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        setSin(sin);
    }

    // Constructor
    public Person(String firstName, String lastName, String sin, Gender gender) throws InvalidSINException, MaxAgeException {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        setSin(sin);
        this.gender = gender;
    }
    public Person(String firstName, String lastName, String sin, Gender gender, int age) throws InvalidSINException, MaxAgeException {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        setSin(sin);
        this.gender = gender;
        setAge(age);
    }

    // Getter and setter methods for other attributes...


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(sin, person.sin) && gender == person.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, sin, gender);
    }
    public String getSin() {
        return sin;
    }

    public void setSin(String sin) throws InvalidSINException {
        if (!isValidSIN(sin)) {
            throw new InvalidSINException();
        }
        this.sin = sin;
    }

// Other methods...

    // Exception class for invalid SIN
    public static class InvalidSINException extends Exception {
        public InvalidSINException() {
            super("Invalid SIN Exception");
        }
    }
    // Static method to validate SIN using regex
    private static boolean isValidSIN(String sin) {
        // SIN must be 9 characters in length and represent a positive 9-digit number
//        String regex = "^[0-9]{9}$";
        String regex = "^(\\d{3}-\\d{3}-\\d{3})|(\\d{9})$";

        return Pattern.matches(regex, sin);
    }
    public static class MaxAgeException extends Exception {
        public MaxAgeException(String message) {
            super(message);
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) throws MaxAgeException {
        if(age>MAX_ALLOWABLE_AGE)
            throw new MaxAgeException("Maximum Age of "+MAX_ALLOWABLE_AGE+" Exceeded: " + age);
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sin='" + sin + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}

