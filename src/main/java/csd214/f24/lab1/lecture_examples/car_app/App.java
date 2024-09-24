// ascii art: https://www.codeproject.com/Articles/876274/Java-ASCII-Art-Generator-in-Java
// https://github.com/korhner/asciimg
package csd214.f24.lab1.lecture_examples.car_app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class App {

    private final Car[] cars = new Car[100];
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
    public int getNumCars() {
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
                        addCar();
                        break;
                    case 2:
                        editCar();
                        break;
                    case 3:
                        deleteCar();
                        break;
                    case 4:
                        listCars();
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


    public void deleteCar() throws Exception {
        listCars();
        System.out.println("\nWhich car would you like to delete?");
        input = new Scanner(System.in);
        int choice = input.nextInt();
        choice--;
        if( (choice < 0) || (choice>=currentIndex))
            throw new Exception("Index out of bounds, try again...");
        deleteCar(choice);
    }

    public void deleteCar(int index) {
        for(int i=index;i<currentIndex;i++){
            cars[i]= cars[i+1];
        }
        cars[currentIndex--]=null;
    }

    public boolean findIfBookExists(Car b){
        for(Car bb: cars){
            if(b.equals(bb))
                return true;
        }
        return false;
    }
    public int findBookIndex(Car b){
        for(int i = 0; i< cars.length; i++){
            if(cars[i].equals(b))
                return i;
        }
        return -1; // not found
    }
    public Car findBook(Car b){
        for(int i = 0; i< cars.length; i++){
            if(cars[i].equals(b))
                return b;
        }
        return null; // not found
    }

    public void addCar() throws Exception {
        Car b = new Car();
        System.out.println("Enter Make:");
        b.setMake(getInput(b.getMake()));
        System.out.println("Enter Model:");
        b.setModel(getInput(b.getModel()));
        System.out.println("Enter Year:");
        b.setYear(getInput(b.getYear()));
        System.out.println("Enter VIN:");
        b.setVIN(getInput(b.getVIN()));
        addCar(b);
    }

    public void addCar(Car b) throws Exception {
        if (currentIndex == cars.length)
            throw new Exception("MAX CARS REACHED");
        cars[currentIndex++] = b;
    }

    public void editCar() throws Exception {
        listCars();
        System.out.println("\nWhich book would you like to edit?");
        input = new Scanner(System.in);
        int choice = input.nextInt();
        if( (choice < 0) || (choice>currentIndex))
            throw new Exception("Index out of bounds, try again...");
        Car b= cars[choice-1];
        editCar(b);
    }
    public void editCar(Car b) {
        inputMake(b);
        inputModel(b);
        inputYear(b);
        inputVIN(b);
//        System.out.println("Enter Make:");
//        b.setMake(getInput(b.getMake()));
//        System.out.println("Enter Model:");
//        b.setModel(getInput(b.getModel()));
//        System.out.println("Enter Year:");
//        b.setYear(getInput(b.getYear()));
//        System.out.println("Enter VIN:");
//        b.setVIN(getInput(b.getVIN()));
    }
    public void inputMake(Car b){
        System.out.println("Enter Make:");
        b.setMake(getInput(b.getMake()));
    }
    public void inputModel(Car b){
        System.out.println("Enter Model:");
        b.setModel(getInput(b.getModel()));
    }
    public void inputYear(Car b){
        System.out.println("Enter Year:");
        b.setYear(getInput(b.getYear()));
    }
    public void inputVIN(Car b){
        System.out.println("Enter VIN:");
        b.setVIN(getInput(b.getVIN()));
    }

    public void listCars() {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i] == null)
                break;
            System.out.printf("%2d. %50s\n", i + 1, cars[i]);
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
