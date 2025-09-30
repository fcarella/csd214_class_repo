package csd214.f25.lab1;

import csd214.f25.lab1.pojos.Book;
import csd214.f25.lab1.pojos.CashTill;

public class App {
    public void run(){
        CashTill till=new CashTill();

        System.out.println("running App");
        Book book1 = new Book("the author", "the title");
        System.out.println(book1);

        book1=new Book();
        book1.edit();
//        System.out.println(book1);
//        book1.edit();
//        System.out.println(book1);
//        book1.edit();
//        System.out.println(book1);

        till.sellItem(book1);

    }
}
