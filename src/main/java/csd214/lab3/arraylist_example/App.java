/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd214.lab3.arraylist_example;

import java.util.ArrayList;

/**
 *
 * @author fcarella
 */
public class App {
    private ArrayList<Publication> pubs=new ArrayList<>();
    
    public App() {
    }

    void run() {
        Book b=new Book("Edgar Rice Burroughs", "Tarzan");
        Magazine m=new Magazine(10, "Scientific American");
        pubs.add(b);
        pubs.add(m);
        for(Publication p:pubs){
            System.out.println(p.toString()+", "+p.abstractMethod());
            // illegal calls
//            p.magazineMethod();
//            p.bookMethod();
//            
        }
    }
    
}
