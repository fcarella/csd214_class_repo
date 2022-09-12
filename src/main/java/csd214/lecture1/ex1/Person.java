package csd214.lecture1.ex1;

import java.util.Objects;

public class Person {
    private String firstname;
    private String lastname;

    private String SIN;

    public Person() {
        System.out.println("In Person Constructor");
    }

    public Person(String firstname, String lastname) {
        this();
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Person(String firstname, String lastname, String SIN) {
        this();
        this.firstname = firstname;
        this.lastname = lastname;
        this.SIN = SIN;
    }

    public String getSIN() {
        return SIN;
    }

    public void setSIN(String SIN) {
        this.SIN = SIN;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", SIN='" + SIN + '\'' +
                '}';
    }

    // BAD example of an equals() and hashCode override, it only checks firstname and lastname

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname);
    }


    // GOOD example of an equals() and hashCode override it checks firstname, lastname AND SIN
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
//        return Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname) && Objects.equals(SIN, person.SIN);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(firstname, lastname, SIN);
//    }



}
