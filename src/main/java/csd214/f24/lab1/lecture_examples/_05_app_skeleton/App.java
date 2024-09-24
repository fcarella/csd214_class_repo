// ascii art: https://www.codeproject.com/Articles/876274/Java-ASCII-Art-Generator-in-Java
// https://github.com/korhner/asciimg
package csd214.f24.lab1.lecture_examples._05_app_skeleton;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class App {

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
                        add();
                        break;
                    case 2:
                        edit();
                        break;
                    case 3:
                        delete();
                        break;
                    case 4:
                        list();
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


    public void delete() throws Exception {
        list();
        int choice=0;
        delete(choice);
    }

    public void delete(int index) {
    }

    public boolean findIfObjectExists(MyObject b){
        return false;
    }
    public int findObjectIndex(MyObject b){
        return -1; // not found
    }
    public MyObject findObject(MyObject b){
        return null; // not found
    }

    public void add() throws Exception {
        java.lang.Object b=new java.lang.Object();
        add(b);
    }

    public void add(java.lang.Object b) throws Exception {
    }

    public void edit() throws Exception {
        list();
        java.lang.Object b=new java.lang.Object();
        edit(b);
    }
    public void edit(java.lang.Object b) {
    }

    public void list() {
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
