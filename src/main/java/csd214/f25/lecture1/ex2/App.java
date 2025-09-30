package csd214.f25.lecture1.ex2;

public class App {
    public void run(){
        System.out.println("Running app...");

        Person joe = new Person();
        Person george=new Person();

        System.out.println(Person.getCount());


        try {
            joe.setAge(2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        joe.count=1;
//        george.count=2;

    }
}
