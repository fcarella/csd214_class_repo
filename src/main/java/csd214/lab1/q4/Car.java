package csd214.lab1.q4;

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
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("car destroyed");
    }
}
