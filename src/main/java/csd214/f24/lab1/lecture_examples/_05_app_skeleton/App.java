// ascii art: https://www.codeproject.com/Articles/876274/Java-ASCII-Art-Generator-in-Java
// https://github.com/korhner/asciimg
package csd214.f24.lab1.lecture_examples._05_app_skeleton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class App {

    private final Book[] books = new Book[100];
    String menu = """

             ----------------
               1. Add
               2. Edit
               3. Delete
               4. List
              99. exit
             ----------------
             Enter your choice:
            """;

    public int getCurrentIndex() {
        return currentIndex;
    }
    public int getNumBooks() {
        return currentIndex;
    }

    private int currentIndex = 0;
    private Scanner input;

    public void run() {
        boolean done = false;
        while (!done) {
            try {
                System.out.println(menu);
                input = new Scanner(System.in);
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        addBook();
                        break;
                    case 2:
                        editBook();
                        break;
                    case 3:
                        deleteBook();
                        break;
                    case 4:
                        listBooks();
                        break;
                    case 99:
                        done = true;
                        break;
                    default:
                        System.out.println("Bad choice, try again...");

                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("You encountered a problem entering information... : ");
            } catch (Exception e) {
                System.out.println("You encountered a problem... : " + e.getMessage());
            }

        }
    }


    public void deleteBook() throws Exception {
        listBooks();
        System.out.println("\nWhich book would you like to delete?");
        input = new Scanner(System.in);
        int choice = input.nextInt();
        choice--;
        if( (choice < 0) || (choice>=currentIndex))
            throw new Exception("Index out of bounds, try again...");
        deleteBook(choice);
    }

    public void deleteBook(int index) {
        for(int i=index;i<currentIndex;i++){
            books[i]=books[i+1];
        }
        books[currentIndex--]=null;
    }

    public boolean findIfBookExists(Book b){
        for(Book bb:books){
            if(b.equals(bb))
                return true;
        }
        return false;
    }
    public int findBookIndex(Book b){
        for(int i=0;i<books.length;i++){
            if(books[i].equals(b))
                return i;
        }
        return -1; // not found
    }
    public Book findBook(Book b){
        for(int i=0;i<books.length;i++){
            if(books[i].equals(b))
                return b;
        }
        return null; // not found
    }

    public void addBook() throws Exception {
        Book b = new Book();
        System.out.println("Enter Title:");
        b.setTitle(getInput(b.getTitle()));
        System.out.println("Enter Author:");
        b.setAuthor(getInput(b.getAuthor()));
        System.out.println("Enter ISBN:");
        b.setIsbn(getInput(b.getIsbn()));
        System.out.println("Enter page count:");
        b.setPageCount(getInput(b.getPageCount()));
        addBook(b);
    }

    public void addBook(Book b) throws Exception {
        if (currentIndex == books.length)
            throw new Exception("MAX BOOKS REACHED");
        books[currentIndex++] = b;
    }

    public void editBook() throws Exception {
        listBooks();
        System.out.println("\nWhich book would you like to edit?");
        input = new Scanner(System.in);
        int choice = input.nextInt();
        if( (choice < 0) || (choice>=currentIndex))
            throw new Exception("Index out of bounds, try again...");
        Book b=books[choice-1];
        editBook(b);
    }
    public void editBook(Book b) {
        inputTitle(b);
        inputAuthor(b);
        inputIsbn(b);
        inputPageCount(b);
//        System.out.println("Enter Title:");
//        b.setTitle(getInput(b.getTitle()));
//        System.out.println("Enter Author:");
//        b.setAuthor(getInput(b.getAuthor()));
//        System.out.println("Enter ISBN:");
//        b.setIsbn(getInput(b.getIsbn()));
//        System.out.println("Enter page count:");
//        b.setPageCount(getInput(b.getPageCount()));
    }
    public void inputTitle(Book  b){
        System.out.println("Enter Title:");
        b.setTitle(getInput(b.getTitle()));
    }
    public void inputAuthor(Book  b){
        System.out.println("Enter Author:");
        b.setAuthor(getInput(b.getAuthor()));
    }
    public void inputIsbn(Book  b){
        System.out.println("Enter ISBN:");
        b.setIsbn(getInput(b.getIsbn()));
    }
    public void inputPageCount(Book  b){
        System.out.println("Enter page count:");
        b.setPageCount(getInput(b.getPageCount()));
    }

    public void listBooks() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null)
                break;
            System.out.printf("%2d. %50s\n", i + 1, books[i]);
        }
    }

    public String getInput(String s) {
        input = new Scanner(System.in);
        String ss = input.nextLine();
        if (ss.trim().isEmpty()) {
            return s;
        }
        Scanner in2 = new Scanner(ss);
        return in2.nextLine();
    }

    public int getInput(int i) {
        input = new Scanner(System.in);
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextInt();
    }

    public Date getInput(Date date) {
        input = new Scanner(System.in);
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return date;
        }
        Scanner in2 = new Scanner(s);
//        String dateInString = "7-Jun-2013";
        String dateInString = in2.nextLine();
        // see https://www.baeldung.com/java-string-to-date
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        Date d;
        try {
            d = formatter.parse(dateInString);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return d;
    }

    public double getInput(double i) {
        input = new Scanner(System.in);
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextDouble();
    }


}
