package csd214.f24.exercise1.lecture1.app_skeleton;

public class App {
    public void run(){
        System.out.println("in App.ruin()");

        Car mustang=new Car();
        Car camaro=new Car();
        Car z=new Car();
        Car chev=new Car("Chevrolet");
        try {
            mustang.setMake("Ford");
            mustang.setModel("mustang");
            mustang.setYear(2024);
//            Car.setCount(Car.getCount()+1);

            camaro.setMake("Chev");
            camaro.setModel("Camaro");
            camaro.setYear(2020);
//            Car.setCount(Car.getCount()+1);

            z.setMake("Nissan");
            z.setModel("z370");
            z.setYear(2009);
//            Car.setCount(Car.getCount()+1);

            System.out.println("Count="+Car.getCount());

        } catch(RuntimeException re){
            System.out.println("runtime exception");
        } catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(mustang);
        System.out.println("make="+mustang.getMake());
    }
}
