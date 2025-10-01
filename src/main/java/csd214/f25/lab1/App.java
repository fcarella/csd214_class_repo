package csd214.f25.lab1;

import csd214.f25.lab1.pojos.*;

public class App {
    public void run(){
        System.out.println("running App");

        CashTill till=new CashTill();

        Book book1 = new Book();
        book1.initialize();
        System.out.println(book1);

        // edit
        book1.edit();
        System.out.println(book1);

        // magazine
        Magazine mag1=new Magazine();
        mag1.initialize();
        System.out.println(mag1);

        // edit
        mag1.edit();


        till.sellItem(book1);
        till.sellItem(mag1);
    }
}
