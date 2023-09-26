package csd214.lecture1.f23.lecture1.person;

public class Main {
    private String whichMain;

    public static void main(String[] args) {
        Person person1 = null;
        try {
            person1 = new Person();
        } catch (Exception e) {
            System.out.println("Negative ages not allowed");
        }

        person1.setFirstname("George");

        try {
            person1.setAge(-48);
        } catch (Exception e) {
            System.out.println("Negative ages not allowed");
        }


        System.out.println("person1's firstname=" + person1.getFirstname());
        System.out.println("person1's lastname=" + person1.getLastname());

        Person p2 = new Person("f", "l", 50, 180, true);
        Person p3 = new Person("f", "l", 50, 180);
        Person p4 = new Person("f", "l", 5);
        try {
            Person p5 = new Person("f", "l");
        } catch (Exception e) {
            System.out.println("Negative ages not allowed");
        }


        int rAge = Person.RETIREMENT_AGE;
        int rAge2 = Person.RETIREMENT_AGE;

        System.out.println("All about person1=" + person1);


        try {
            Person p1 = new Person("Joe", "Student");
            Person p5 = new Person("Joe", "Student");
            if(p1==p5)
                System.out.println("p1 and p5 are the same person");
            else
                System.out.println("Not the same");

            if(p1.equals(p5))
                System.out.println("p1 and p5 are the same person");
            else
                System.out.println("Not the same");


        }catch(Exception e){
            System.out.println("error");
        }





    }
}
