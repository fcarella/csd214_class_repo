package csd214.lab1.q4;

import java.util.Objects;

public class Car {
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
}
