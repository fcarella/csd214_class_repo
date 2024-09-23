/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd214.f24.lab1.lecture_examples._03_pojo_and_beans.person_01;

/**
 *
 * @author Fred
 */
public class Person {
    private String firstname;
    private String lastname;

    public Person() {
        // set defaults
        this.firstname="firstname not set";
        this.lastname="lastname not set";
    }

    public Person(String firstname) {
        this();// call no-arg constructor to set defaults on uninitialized attributes
        this.firstname = firstname;
    }

    public Person(String firstname, String lastname) {
        // no need to set defaults so no call to this()
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
