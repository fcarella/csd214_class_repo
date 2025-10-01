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


        // Example of testing input (you'd typically do this in a JUnit test)
        // String simulatedUserInput = "Test Book Title\nTest Author\n19.99\n5\n";
        // ByteArrayInputStream testIn = new ByteArrayInputStream(simulatedUserInput.getBytes());
        // book1.setSystemInput(testIn); // Redirect System.in
        // book1.initialize(); // This would now read from testIn
        // System.setIn(System.in); // Reset System.in
        // System.out.println("Book after simulated input: " + book1);
    }
}
