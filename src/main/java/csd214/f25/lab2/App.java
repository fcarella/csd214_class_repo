package csd214.f25.lab2;

import csd214.f25.lab2.pojos.*;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private final String menu = "\n***********************\n"
            + " 1. Add Items\n"
            + " 2. Edit Items\n"
            + " 3. Delete Items\n"
            + " 4. Sell item(s)\n"
            + " 5. List items\n"
            + "99. Quit\n"
            + "***********************\n"
            + "Enter choice: ";

    private final ArrayList<SaleableItem> saleableItems = new ArrayList<>();
    private final int currentItem = 0;

    private Scanner input;
    private final PrintStream out;

    // Default constructor for normal execution
    public App() {
        this(System.in, System.out);
    }
    // Constructor for testing
    public App(InputStream in, PrintStream out) {
        this.input = new Scanner(in);
        this.out = out;
    }

    public void run() {
        boolean done = false;
        while (!done) {
            try {
//                input = new Scanner(System.in);
                System.out.println(menu);
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Add an item\n");
                        addItem();
                        break;
                    case 2:
                        System.out.println("Edit an item\n");
                        editItem();
                        break;
                    case 3:
                        System.out.println("Delete an item\n");
                        deleteItem();
                        break;
                    case 4:
                        System.out.println("Sell a car\n");
                        sellItem();
                        break;
                    case 5:
                        System.out.println("All Items\n-----------");
                        listAny();
                        break;
                    case 99:
                        done = true;
                        System.out.println("***********************");
                        System.out.println("99. Quit");
                        System.out.println("Exiting application. Goodbye!");

                        break;
                    default:
                        System.out.println("Wrong entry, try again...");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong entry, try again...");
            } catch (Exception e) {
                System.out.println("Unknown Exception : " + e.getMessage());
            }
        }
    }
    public boolean findItemExists(SaleableItem item){
        return false;
    }
    public SaleableItem findItem(SaleableItem item){
        return new Book();
    }
    public void editItem(){

    }
    public void editItem(Editable item){

    }
    public void deleteItem(){

    }
    public void populate(){}
    public void listAny(){}
    public SaleableItem getItem(SaleableItem item){
        return null;
    }
    public void sellItem(){}
    public void listI(Object i){}
    public void addItem(){}
    public void addItem(SaleableItem item){}

}
