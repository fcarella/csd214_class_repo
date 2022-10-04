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
public class Employee extends Person {
    private String employer;

    public Employee() {
        System.out.println("Employee Contructor");
    }

    public Employee(String employer) {
        System.out.println("Employee Contructor");
        this.employer = employer;
    }

    public Employee(String employer, String firstname, String lastname) {
        super(firstname, lastname);
        System.out.println("Employee Contructor");
        this.employer = employer;
    }

    @Override
    public String toString() {
        return "My Empoloyer is "+employer+" "+ super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
