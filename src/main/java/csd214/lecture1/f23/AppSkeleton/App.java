package csd214.lecture1.f23.AppSkeleton;


public class App {

    private Person owner;
    private final int SIZE_OF_CARLOT=10;

    private Car[] cars=new Car[SIZE_OF_CARLOT];
    public void run(){
        System.out.println("The app is running...");
        owner=new Person("George", "Washington");
        System.out.println("owner="+owner);
        cars[0]=new Car(2019);

        int yr=2000;
        for(int i=0;i<cars.length;i++){
            cars[i]=new Car(yr++);
        }
        yr=2000;
    }
}
