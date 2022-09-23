package csd214.lecture1.pojo_test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1;
    Person p2;
    Person p3;
    Person p4;

    @BeforeEach
    void setUp() {
        try {
            p1=new Person("first", "last", 20, "1234");
            p2=new Person("first", "last", 20, "1234");
            p3=new Person("first", "last", 20, "12345");
            p4=p1;
        }catch (Exception e){
            System.out.println("Error");
        }
    }

    @Test
    void test1() {
        assertEquals(p1,p2);
        assertNotEquals(p1, p3);
        assertEquals(p1,p4);

    }
    @Test
    void test2() {
        p1.setLastname("ssss");
        assertNotEquals(p1,p2);
    }


}