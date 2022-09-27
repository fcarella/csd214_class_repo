package csd214.lecture1.pojo_test;

import java.util.Objects;

public class Person  {

    // class static variables
    private static int COUNT;

    // instance variables
    private String firstname;
    private String lastname;
    private int age;
    private String SIN;


    public static int getCOUNT() {
        return COUNT;
    }


    public void setFirstname(String fname){
        firstname=fname;
    }
    public Person(){
        COUNT++;
        this.firstname="default firstname";
        this.lastname="default lastname";
        this.age=0;
        this.SIN="000000";
    }
    public Person(String firstname, String lastname, int age, String SIN) throws Exception {
        this();
        this.firstname=firstname;
        this.lastname=lastname;
        setAge(age);
        this.SIN=SIN;
    }

    public Person(String firstname, String lastname, int age) {
        this();
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age<0) throw new Exception("negative ages not allowed");
        this.age = age;
    }

    public String getSIN() {
        return SIN;
    }

    public void setSIN(String SIN) {
        this.SIN = SIN;
    }

    public String getFirstname(){
        return firstname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", SIN='" + SIN + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(firstname, person.firstname) && Objects.equals(lastname, person.lastname) && Objects.equals(SIN, person.SIN);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, lastname, age, SIN);
    }

//    @Override
//    public void finalize() throws Exception {
//        System.out.println("finalizing Person");
//        COUNT--;
//    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalizing Person");
        COUNT--;
    }
}
