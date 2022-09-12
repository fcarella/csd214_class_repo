package csd214.lecture1.ex1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p=new Person("Fred", "Carella", "1234");

    @BeforeEach
    void setUp() {
        p=new Person("Fred", "Carella", "1234");
    }

    @Test
    void testFirstname() {
        System.out.println(p);
        assertEquals(p.getFirstname(), "Fred");
    }
    @Test
    void testFirstname2() {
        System.out.println(p);
        p.setFirstname("dd");
        assertNotEquals(p.getFirstname(), "Fred");
    }
    @Test
    void testFirstname3() {
        System.out.println(p);
        p.setLastname("dd");
        assertNotEquals(p.getLastname(), "Fred");
    }
}