package csd214.f24.lab1.car;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author fcarella
 */
public abstract class Editable implements Serializable {
    public Scanner input = new Scanner(System.in);

    public abstract void edit();

    // see https://stackoverflow.com/questions/6415728/junit-testing-with-simulated-user-input
    public abstract void edit4UnitTesting(String make);
    // setInput, setOutput are used when unit testing
    // see https://stackoverflow.com/questions/1647907/junit-how-to-simulate-system-in-testing
    public void setSystemInput(ByteArrayInputStream testIn){
        System.setIn(testIn);
        input=new Scanner(System.in);
    }
    public void setSystemOutput(ByteArrayOutputStream testOut){
        System.setOut(new PrintStream(testOut));
    }
    public abstract void initialize();

    public String getInput(String s) {
        String ss = input.nextLine();
        if (ss.trim().isEmpty()) {
            return s;
        }
        Scanner in2 = new Scanner(ss);
        return in2.nextLine();
    }

    public int getInput(int i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextInt();
    }

    public double getInput(double i) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return i;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextDouble();
    }
    public boolean getInput(boolean b) {
        String s = input.nextLine();
        if (s.trim().isEmpty()) {
            return b;
        }
        Scanner in2 = new Scanner(s);
        return in2.nextBoolean();
    }

    public Date getInput(Date date) {
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
}