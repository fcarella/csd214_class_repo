package csd214.f24.exercise1.lecture1.app_skeleton;

public class Car {
    // instance variables
    private String make;
    private String model;
    private int year;

    private static int count;

    public Car(){
        count++;
    }

    public Car(String make) {
        this();
        this.make = make;
    }

    public Car(String make, String model) {
        this(make);
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this(make, model);
        this.year = year;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Car.count = count;
    }

    private boolean sold;

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    // public setters and getters
    public String getMake(){
        return make;
    }

    // the parameter "make" is a "local variable
    // its visible in the setMake method
    public void setMake(String make){
        this.make=make;
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

    public void setYear(int year) throws Exception{
        if(year<=0)
            throw new Exception("negative \"year\" is not allowed");
        this.year = year;
    }
}
