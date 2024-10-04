package csd214.f24.lab1.car;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private static final InputStream systemIn = System.in;
    private static final PrintStream systemOut = System.out;

    private static ByteArrayInputStream testIn;
    private static ByteArrayOutputStream testOut;


    @BeforeAll
    public static void setUpOutput() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }
    @AfterAll
    public static void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }
    private void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }
    private String getOutput() {
        return testOut.toString();
    }

    Car c1, c2, c3, c4;
    App app;

    @BeforeEach
    public void setupEach(){
        c1 =new Car("chevy", 2000);
        c2 =new Car("chevy", 2000);
        c3 =new Car("chevy", 2010);
        c4 = c1;
        app=new App();
    }


    @Test
    void addCarTest() {
        Car c=new Car("Nissan 370z", 2009);
        app.addCar(c);
        assertTrue(app.findCar(c));
    }
    @Test
    void addCarTest2() {
        Car c=new Car("Nissan 370z", 2009);
        app.addCar(c);
        Car c2=new Car("Nissan 370zz", 2009);
        assertFalse(app.findCar(c2));
    }
    @Test
    void editCarTest() {
        // see https://stackoverflow.com/questions/1647907/junit-how-to-simulate-system-in-testing
        String makeAndYear="Nissan 370z\n2009";
        provideInput(makeAndYear);
        Car c6=new Car("Nissan 370z",2009);
        c1.setSystemInput(testIn);
        c1.setSystemOutput(testOut);
        app.editCar(c1);
        assertEquals(c6, c1);
    }
}