package csd214.lab3;

import java.util.ArrayList;
import java.util.Date;

public class App {
    ArrayList<Publication> pubs=new ArrayList<>();
    public void run() {
        Book b=new Book("Book Title", "book author", 20.50, 10);
        Magazine m=new Magazine("Book Title",new Date(2022, 12, 31), 20.50, 10);
        pubs.add(b);
        pubs.add(m);
        
        for(Publication p:pubs){
            System.out.println("pub= "+p);
        }
    }
}
