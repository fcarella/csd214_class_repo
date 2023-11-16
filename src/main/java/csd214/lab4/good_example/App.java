package csd214.lab4.good_example;

import java.util.ArrayList;
import java.util.Scanner;

public class App  extends Editable {
    private ArrayList<Publication> pubs=new ArrayList<>();
    private Scanner input=new Scanner(System.in);
    private String menu=
            " 1. Add a Book\n"+
            " 2. Add a Magazine\n"+
            " 3. Edit publication\n"+
            " 4. List publications\n"+
            "-1. Quit";
    public void run() {
        boolean done=false;
//        Book b=new Book("Book Title", "book author", 20.50, 10);
//        Magazine m=new Magazine("Magazine Title",new Date(2022, 12, 31), 20.50, 10);
//        pubs.add(b);
//        pubs.add(m);

        while(!done) {
            System.out.println(menu);
            int choice=getInput(-1);
            switch (choice) {
                case 1:
                    Book book=new Book();
                    book.initialize();
                    pubs.add(book);
                    break;
                case 2:
                    Magazine magazine=new Magazine();
                    magazine.initialize();
                    pubs.add(magazine);
                    break;
                case 3:
                    edit();
                    break;
                case 4:
                    list();
                    break;
                case -1:
                    done = true;
            }
        }
    }
    private void edit(){
        boolean done=false;
        list();
        System.out.println("Which publication to edit (-1 to quit)?");
        int choice=getInput(-1);

        Publication p=pubs.get(choice-1);
        p.edit();

    }
    private void list(){
        System.out.println("Print all Publications");
        int i=0;
        for(Publication p:pubs){
            System.out.println((++i)+". "+p);
        }

    }


}
