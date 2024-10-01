package csd214.f24.lab1.car;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Objects;
import java.util.Scanner;

public class Car extends Editable {
    private String make;

    public Car(String make) {
        this.make = make;
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
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(make, car.make);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make);
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
    }

    @Override
    public void edit4UnitTesting(String makeString) {
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
