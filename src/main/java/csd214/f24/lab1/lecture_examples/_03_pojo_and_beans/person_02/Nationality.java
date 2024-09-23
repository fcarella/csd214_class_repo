/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package csd214.f24.lab1.lecture_examples._03_pojo_and_beans.person_02;

/**
 *
 * @author Fred
 */
public abstract class Nationality {

    private String nationalId;
    private String regex;

    public String getNationalId(){
        return nationalId;
    }
    public abstract void setNationalId(String nationalId) throws InvalidNationalIdException ;
    public abstract boolean isValidNationalId(String id);
    // Exception class for invalid SIN
    public static class InvalidNationalIdException extends Exception {
        public InvalidNationalIdException(String msg) {
            super(msg);
        }
    }

}
