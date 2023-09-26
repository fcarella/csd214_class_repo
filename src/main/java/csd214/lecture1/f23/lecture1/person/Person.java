package csd214.lecture1.f23.lecture1.person;

import java.io.Serializable;
import java.util.Objects;

public class Person implements Serializable {
    // declare/define instance variables

    private String firstname;
    private String lastname;
    private int age; // instance variable called age
    private int weight;
    private boolean retired;

    // define class (static) variables
    // retirementAge is final (constant) which means it cant be changed and its static (ie its a class variable)
    // which means theres only one copy of it for every instance.
    public final static int RETIREMENT_AGE=65;

    // default no argument constructor.  Initialize the object
    public Person() throws Exception {
        // intialize default values
        setFirstname("First name not set");
        setLastname("Lastname not set");
        setAge(21);
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(!(obj instanceof Person))
//            return false;
//        Person p=(Person)obj;// converts or "casts" the object to a Person
//        if(p==this)
//            return true;
//
//        if(p.getFirstname().equals(this.getFirstname()) && p.getLastname().equals(this.getLastname()))
//            return true;
//        else
//            return false;
//    }

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

    public Person(String firstname, String lastname) throws Exception {
        // intialize default values
        setFirstname(firstname);
        setLastname(lastname);
        setAge(21);
    }

    public Person(String firstname, String lastname, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public Person(String firstname, String lastname, int age, int weight) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.weight = weight;
    }

    public Person(String firstname, String lastname, int age, int weight, boolean retired) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.weight = weight;
        this.retired = retired;
    }

    public boolean isRetired() {
        return retired;
    }

    public void setRetired(boolean retired) {
        // the parameter retired is a local variable.  It is local to the isRetired method
        // note the this.retired is the instance variable
        this.retired = retired;
    }

    public int getWeight() {
        // minimumWeight and maximumWeight are local variables
        int minimumWeight=0;
        int maximumWeight=200;
        return weight;
    }


    public void setWeight(int weight) {
        this.weight = weight;
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

    public int getAge(){
        return age;
    }
    public void setAge(int age) throws Exception{
        if(age<=0)
            throw new Exception("Negative ages are not allowed");
        this.age=age;
    }

    public String toString(){
        return "["+firstname+"]"+"["+lastname+"]";
    }

}
