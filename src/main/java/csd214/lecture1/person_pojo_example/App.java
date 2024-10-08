package csd214.lecture1.person_pojo_example;

import java.util.concurrent.TimeUnit;

public class App {
    public void run() {
        // run this twice.
        // first run with bad version of Person.equals
        // then run with good version of Person.equals
        //
        Person fred1 = new Person("Fred", "Carella", "1234");
        System.out.println("fred1="+fred1);

        // this is a problem, has the same SIN as fred1, are they equal??
        Person fred2 = new Person("Fred2", "Carella2", "1234");
        System.out.println("fred2="+fred2);

        // this is a problem, fred3 has same name as fred 1, are they equal??
        Person fred3 = new Person("Fred2", "Carella2", "1234");
        System.out.println("fred3="+fred3);

        if(fred1.equals(fred2))
            System.out.println("this is bad, fred1 equals fred2");
        else
            System.out.println("this is good, fred1 != fred2");

        if(fred1.equals(fred3))
            System.out.println("this is bad, fred1 equals fred2");
        else
            System.out.println("this is good, fred1 != fred2");


        Person p=new Person();
        System.out.println("Count="+Person.getCOUNT());
        p=null;
        System.gc();
        // we need  a time delay to ensure the garbage collector runs
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Count="+Person.getCOUNT());
    }
}
