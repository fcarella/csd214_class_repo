package csd214.lab4.bad_example;

import java.util.ArrayList;
import java.util.Date;

public class App {
    ArrayList<Publication> pubs=new ArrayList<>();
    ArrayList<Book> books=new ArrayList<>();
    ArrayList<Magazine> magazines=new ArrayList<>();

    public void run() {
        Book b=new Book("Book Title", "book author", 20.50, 10);
        Magazine m=new Magazine("Book Title",new Date(2022, 12, 31), 20.50, 10);
        pubs.add(b);
        pubs.add(m);
        
        System.out.println("Print all publications");
        for(Publication p:pubs){
            System.out.println("Publication = "+p);
        }
        
        System.out.println("Print all Books");
        for(Publication p:pubs){
            if(p instanceof Book)
                System.out.println("Book = "+p);
        }
        
        System.out.println("Print all Magazines");
        for(Publication p:pubs){
            if(p instanceof Magazine)
                System.out.println("Magazine = "+p);
        }
        
        
    }
}
