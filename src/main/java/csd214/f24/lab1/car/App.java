
  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd214.f24.lab1.car;


  import java.util.ArrayList;
  import java.util.InputMismatchException;
  import java.util.Scanner;

public class App {

    private static final int MAX_ITEMS = 100;
    private static final String menu = "\n***********************\n"
            + " 1. Add cars\n"
            + " 2. Edit cars\n"
            + " 3. List cars\n"
            + "99. Quit\n"
            + "***********************\n"
            + "Enter choice: ";
    //private final SaleableItem[] saleableItems = new SaleableItem[MAX_ITEMS];
    private final ArrayList<Car> cars =new ArrayList<>();
    private int currentItem = 0;
    private Scanner input = null;

    public void run() {

        populate();

        boolean done = false;
        while (!done) {
            try {
                input = new Scanner(System.in);
                System.out.println(menu);
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Add a car\n");
                        addCar();
                        break;
                    case 2:
                        System.out.println("Edit a car\n");
                        editCar();
                        break;
                    case 3:
                        System.out.println("List All cars\n-----------");
                        list();
                        break;
                    case 99:
                        done = true;
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

    private void populate() {
        Car c1=new Car();
        Car c2=new Car("Ford");
        Car c3=new Car("Chevy");

        addCar(c1);
        addCar(c2);
    }

    private void addCar() {
        Car b = new Car();
        b.initialize();
        addCar(b);
    }

    public void addCar(Car s) {
        cars.add(s);
    }

    private void editCar() {
        try {
            while (true) {
                list();
                Car b=null;
                int choice;
                System.out.println("Choose an item to edit or 99 to exit:");
                input = new Scanner(System.in);
                choice = input.nextInt();
                if(choice==99)
                    break;
                choice--;
                if (choice > 0 && choice < cars.size())
                    b = cars.get(choice);
                assert b != null;
            }
        }catch (Exception e){
            System.out.println("Wrong choice, try again: \n"+e.getMessage());
        }
    }

    private void editCar(Car c){
        editCar((Editable) c);
    }


    public boolean findCar(Car c) {
        for (Car cc : cars) {
            if (c.equals(cc)) return true;
        }
        return false;
    }
    public int findCarIndex(Car c) {
        int i=0;
        for (i=0;i<cars.size();i++) {
            if (c.equals(cars.get(i))) return i; // car found return index
        }
        return -1;// -1 == not found
    }
    public void editCar(Editable s) {
        s.edit();
    }

    private void deleteItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void sellItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void list() {
        int i=0;
            for(Car s: cars)
                System.out.println((++i)+". "+s+"\n");
    }


}
