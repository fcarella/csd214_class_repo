/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd214.lecture3.ex1;


/**
 *
 * @author fcarella
 */
public class Person extends Object{
    private String firstname;
    private String lastname;

    public Person() {
        System.out.println("Person Constructor");
    }

    @Override
    public String toString() {
        return "["+firstname+","+lastname+"]"; //To change body of generated methods, choose Tools | Templates.
    }

    public Person(String firstname, String lastname) {
        System.out.println("Person Constructor");
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    
    
}
