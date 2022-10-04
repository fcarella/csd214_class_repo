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
public class Main {
    public static void main(String[] args) {
        Person loris=new Person();
        loris.setFirstname("Loris");
        loris.setLastname("Rugolo");
        
        Employee dave=new Employee("Sault College", "Dave", "Scott");
        
        Person david=dave;
        
        System.out.println("Loris="+loris);
        System.out.println("Dave="+dave);
        System.out.println("David="+david);
        
        
    }
}
