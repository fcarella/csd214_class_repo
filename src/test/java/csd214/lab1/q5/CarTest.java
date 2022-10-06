package csd214.lab1.q5;

import csd214.lab1.q4.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car c1;
    Car c2;


    @BeforeEach
    void setUp() {
        c1=new Car("Ford");
        c2=new Car("Ford");
    }
    @Test
    void test1() {
        assertEquals(c1,c2);
    }


    @Test
    void test3() {
        Car c3=c1;
        assertEquals(c1,c3);
    }

    @Test
    void test2() {
        c1.setMake("xxx");
        assertNotEquals(c1,c2);
    }



}