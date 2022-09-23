package csd214.lecture1.pojo_test;

public class App {

    public void run(){
        System.out.println("Running the app");
        try {
            Person student = new Person();
            student.setFirstname("Johnny");


            Person student2 = new Person("Jill", "Lastname", 21, "1234");

            System.out.println(student.getFirstname());
            System.out.println(student);
            System.out.println(student2);

            if(student.equals(student2)){
                System.out.println("They're equal");
            }else{
                System.out.println("They are not equal");
            }

            System.out.println("Number of people="+Person.getCOUNT());
            student=null;
            System.gc();
            System.out.println("Number of people="+Person.getCOUNT());

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
