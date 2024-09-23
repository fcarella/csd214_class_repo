/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd214.f24.lab1.lecture_examples._03_pojo_and_beans.person_02;

/**
 *
 * @author Fred
 */
public class Person {

    private String firstname;
    private String lastname;
    private Nationality nationality;

    public enum Gender {
        M("Male"), F("Female"), O("Other"); //, Q("Quit");
        public String getLongName() {
            return longName;
        }
        public void setLongName(String longName) {
            this.longName = longName;
        }
        private String longName;
        Gender(String longName) {
            this.longName = longName;
        }
    }

    public Person() throws Nationality.InvalidNationalIdException {
        // set defaults
        this.firstname = "firstname not set";
        this.lastname = "lastname not set";
        this.nationality = new Canadian();
    }

    public Person(String firstname) throws Nationality.InvalidNationalIdException {
        this();// call no-arg constructor to set defaults on uninitialized attributes
        this.firstname = firstname;
    }


    public Person(String firstname, String lastname) throws Nationality.InvalidNationalIdException {
        this();
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Person(String firstname, String lastname, Nationality nationality) throws Nationality.InvalidNationalIdException {
        this();
        this.firstname = firstname;
        this.lastname = lastname;
        this.nationality = nationality;
    }}
