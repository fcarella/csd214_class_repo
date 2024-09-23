/*
* Another example of how to handle exeptions.
* Here we handle Nationality exceptions
*/
package csd214.f24.lab1.lecture_examples._03_pojo_and_beans.person_02;

public class Main {
    public static void main(String[] args) throws Nationality.InvalidNationalIdException {
        Person p1=new Person();
        Person p2=new Person("Fred");
        Person p3=new Person("Fred", "Carella");
        Person p4=new Person("Fred", "Carella", new Canadian());
        try {
            Person p5 = new Person("Fred", "Carella", new Canadian("574680958"));
            Person p6 = new Person("Fred", "Carella", new American());
        }catch(Canadian.InvalidSINException | American.InvalidSSNException e){
            System.out.println(e.getMessage());
        }
        try {
            Person p7 = new Person("Fred", "Carella", new Canadian("574680958"));
            Person p8 = new Person("Fred", "Carella", new American());
        }catch(Canadian.InvalidSINException | American.InvalidSSNException e){
            System.out.println(e.getMessage());
        }
    }
}
