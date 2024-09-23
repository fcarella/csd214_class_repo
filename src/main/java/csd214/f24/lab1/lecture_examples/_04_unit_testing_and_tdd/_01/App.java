/*
* Gets user input from the console to set age, name and salary
* - AppTest tests junits ability to simulate use input from the console
* */
package csd214.f24.lab1.lecture_examples._04_unit_testing_and_tdd._01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class App {
    String name="";
    int age=0;
    double salary=0.0d;

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    Scanner in =new Scanner(System.in);

    public void run() {
        inputName();
        inputAge();
        inputSalary();
        System.out.println("Name="+getName());
        System.out.println("Age="+getAge());
        System.out.println("Salary="+getSalary());
    }
    public void inputAll() {
        System.out.println("Enter name:");
        setName(getInput(getName()));
        System.out.println("Enter age:");
        setAge(getInput(getAge()));
        System.out.println("Enter salary:");
        setSalary(getInput(getSalary()));
    }

    public void inputSalary() {
        System.out.println("Enter salary:");
        setSalary(getInput(getSalary()));
    }

    public void inputAge() {
        System.out.println("Enter age:");
        setAge(getInput(getAge()));
    }

    public void inputName() {
        System.out.println("Enter name:");
        setName(getInput(getName()));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private String getInput(String s) {
        in = new Scanner(System.in);
        String ss = in.nextLine();
        if (ss.trim().isEmpty()) {
            return s;
        }
        Scanner in2 = new Scanner(ss);
        return in2.nextLine();
    }

    private int getInput(int i) {
        in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextInt();
    }

    public Date getInput(Date date) {
        in = new Scanner(System.in);
        String s = in.nextLine();
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

    private double getInput(double i) {
        in = new Scanner(System.in);
        String s = in.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextDouble();
    }

}
