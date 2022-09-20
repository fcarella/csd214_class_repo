/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd214.lecture1.ApplicationSkeleton.ex2;

import java.util.Scanner;

/**
 *
 * @author fcarella
 */
public class App {

    private int number;
    private double realNumber;
    private Double realNumberObject;
    public static int COUNT;

    public void run() {
        boolean done = false;
        String prompt = "1. Option 1\n2.Make a car\n99. Exit";
        while (!done) {
            System.out.println(prompt);
            Scanner in = new Scanner(System.in);
            try {
                int choice = in.nextInt();
                switch (choice) {
                    case 1:
                        // Start coding yor app here...
                        System.out.println("Running Lab 4");
                        System.out.println("number=" + number);
                        System.out.println("realNumber=" + realNumber);
                        System.out.println("realNumber=" + realNumberObject);
                        break;
                    case 2:
                        Car mustang = new Car();
                        mustang.setMake("ford");
                        mustang.setModel("Mustang");
                        mustang.setYear(2021);
                        break;
                    case 99:
                        done = true;
                }
            } catch (Exception e) {
                in = new Scanner(System.in);
                System.out.println("Bad input probably, try again...");
            }

        }
    }
}
