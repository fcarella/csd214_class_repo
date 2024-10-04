package csd214.f24.lab1.car;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class Car extends Editable {
    private String make;
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String make) {
        this.make = make;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public Car() {
        this.make="no make";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getYear() == car.getYear() && Objects.equals(getMake(), car.getMake());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMake(), getYear());
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("car destroyed");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                '}';
    }

    @Override
    public void edit() {
        System.out.println("Edit Make (" + getMake() + " [enter for no changes])");
        setMake(getInput(getMake()));
        setYear(getInput(getYear()));
//        int x=getInput(2);
//        int z=x;
    }

    @Override
    public void edit4UnitTesting(String makeString) {
        // see https://stackoverflow.com/questions/6415728/junit-testing-with-simulated-user-input

        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream(makeString.getBytes());
        System.setIn(in);
        input=new Scanner(System.in);

        // do your thing
//        setMake(getInput(getMake()));
        edit();

        // optionally, reset System.in to its original
        System.setIn(sysInBackup);
        input=new Scanner(System.in);
    }


    @Override
    public void initialize() {
        System.out.println("Enter Make:");
        setMake(getInput("no make"));
    }

}
