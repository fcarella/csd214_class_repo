package csd214.f24.lab1.car;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App app=new App();
    Car c=new Car();
    @Test
    void editItem() {

        String make="Test Car";
        c.edit4UnitTesting(make);

    }
}