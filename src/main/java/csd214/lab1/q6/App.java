package csd214.lab1.q6;

import csd214.lab1.q4.Car;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private final int numCars = 100;
    private Car[] unsoldCars = new Car[numCars];
    private Car[] soldCars = new Car[numCars];
    private int unsoldCurrentIndex = 0;
    private int soldCurrentIndex = 0;
    private Scanner input = new Scanner(System.in);
    private String menu = ""
            + "----------------\n"
            + " 1. Add a Car\n"
            + " 2. Edit a car\n"
            + " 3. Delete an unsold Car\n"
            + " 4. Delete a sold Car\n"
            + " 5. List unsold Cars\n"
            + " 6. List sold Cars\n"
            + " 7. Sell a Car\n"
            + "99. Exit\n";

    public void run() {

        Car c=new Car("xxxx");
        System.out.println("Car created");
        c=null;
        System.gc();

        boolean done=false;
        while (!done) {
            System.out.println("" + menu);
            try {
                input=new Scanner(System.in);
                int choice = input.nextInt();

                switch (choice) {
                    case 1:
                        add();
                        break;
                    case 2: edit();
                    break;
                    case 5:
                        listUnsoldCars();
                        break;
//                    case 3:
//                        mutltiply();
//                        break;
//                    case 4:
//                        divide();
//                        break;
                    case 99:
                        done=true;
                        break;
                    default:
                        System.out.println("You chose incorrectly");

                }
            } catch (InputMismatchException e) {
                System.out.println("You entered an incorrect option, please try again.");
            } catch(UnsupportedOperationException e){
                System.out.println("Unsupported operation.");
            }
        }
        System.exit(0);
    }

    private void edit() {
        listUnsoldCars();
        System.out.println("Which car would you like to edit ?:");
        int choice = input.nextInt();
        input = new Scanner(System.in); // reset the scanner
        if ((choice < unsoldCurrentIndex + 1) && choice > 0) {
            Car c = unsoldCars[choice - 1];
            System.out.println("Make: " + c.getMake());
            c.setMake(getInput(c.getMake()));
//            System.out.println("Model: " + c.getModel());
//            c.setModel(getInput(c.getModel()));
//            System.out.println("Year: " + c.getYear());
//            c.setYear(getInput(c.getYear()));
        } else {
            System.out.println("Choice out of bounds");
        }
        System.out.println("");
    }
    private void listUnsoldCars() {
        System.out.println("--------------------");
        System.out.println("List of unsold cars");
        System.out.println("--------------------");
        for(int i=0;i<unsoldCars.length;i++){
            Car c=unsoldCars[i];
            if(c==null)
                break;
            System.out.println( (i+1)+". "+c.getMake());
        }
    }

    public void add(Car c){
        unsoldCars[unsoldCurrentIndex]=c;
        unsoldCurrentIndex++;

    }

    private void add() {
        Car c=new Car("Unknown make");
        System.out.println("Enter the make");
        input = new Scanner(System.in); // reset the scanner
        String make=getInput(c.getMake());
        c.setMake(make);
        System.out.println("Make="+c.getMake());
        add(c);
    }

//    private void edit() {
//        list(1);
//        System.out.println("Which car would you like to edit ?:");
//        int choice = input.nextInt();
//        input = new Scanner(System.in); // reset the scanner
//        if ((choice < currentIndex + 1) && choice > 0) {
//            Car c = cars[choice - 1];
//            System.out.println("Make: " + c.getMake());
//            c.setMake(getInput(c.getMake()));
//            System.out.println("Model: " + c.getModel());
//            c.setModel(getInput(c.getModel()));
//            System.out.println("Year: " + c.getYear());
//            c.setYear(getInput(c.getYear()));
//        } else {
//            System.out.println("Choice out of bounds");
//        }
//        System.out.println("");
//    }

    private String getInput(String s) {
        String ss = input.nextLine();
        if (ss.trim().isEmpty()) {
            return s;
        }
        Scanner in2 = new Scanner(ss);
        return in2.nextLine();
    }

    private int getInput(int i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextInt();
    }
    private double getInput(double i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextDouble();
    }


}
