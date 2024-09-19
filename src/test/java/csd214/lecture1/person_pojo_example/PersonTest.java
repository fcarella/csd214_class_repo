package csd214.lecture1.person_pojo_example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person fred1 = new Person("Fred", "Carella", "1234");
    // this is a problem, has the same SIN as fred1, are they equal??
    Person fred2 = new Person("Fred2", "Carella2", "1234");
    // this is a problem, fred3 has same name as fred 1, are they equal??
    Person fred3 = new Person("Fred2", "Carella2", "12345");

    @Test
    void testEquals() {
        assertNotEquals(fred1, fred2);
    }
    @Test
    void testEquals2() {
        assertNotEquals(fred2, fred3);
    }
}