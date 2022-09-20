/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd214.lecture1.ApplicationSkeleton;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author fcarella
 */
public class App {

    public void run() {
        boolean done=false;
        String menuString = "Simple Calculator" + "\n"
                + "1. Add 2 numbers" + "\n"
                + "2. Subtract 2 numbers" + "\n"
                + "3. Multiply 2 numbers" + "\n"
                + "4. Divide 2 numbers" + "\n"
                + "99. Exit" + "\n"
                + "Please enter the operation to perform (1, 2, 3 or 4) : " + "\n";
        Scanner in = new Scanner(System.in);
        while (!done) {
            System.out.println("" + menuString);
            try {
                int choice = in.nextInt();

                switch (choice) {
                    case 1:
                        add();
                        break;
                    case 2:
                        subtract();
                        break;
                    case 3:
                        mutltiply();
                        break;
                    case 4:
                        divide();
                        break;
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

    private void add() {
        Scanner in = new Scanner(System.in);
        // get 2 numbers and add them.
        System.out.println("Adding 2 numbers");
    }

    private void subtract() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void mutltiply() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void divide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
