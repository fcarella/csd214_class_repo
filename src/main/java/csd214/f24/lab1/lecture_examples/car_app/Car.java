package csd214.f24.lab1.lecture_examples.car_app;//package csd214.f24.lab1.lecture_examples._05_app_skeleton;

//import java.io.Serializable;
import java.util.Objects;

public class Car implements java.io.Serializable {

    private String make;
    private String model;
    private int year;
    private String VIN;


    private static int count;
    public Car() {
        this.make="uninitialized make";
        this.model="uninitialized model";
        this.year=-1;
        count++;
    }

    public Car(String make) {
        this();
        this.make = make;
    }

    public Car(String make, String model) {
        this();
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this();
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return getYear() == car.getYear() && Objects.equals(getMake(), car.getMake()) && Objects.equals(getModel(), car.getModel()) && Objects.equals(getVIN(), car.getVIN());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMake(), getModel(), getYear(), getVIN());
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", VIN='" + VIN + '\'' +
                '}';
    }
    // getters, and setters

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Car.count = count;
    }


}
