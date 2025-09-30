package csd214.f25.lecture1.ex2;

public class Person {
    //
    private static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    // instance
    private String firstname;
    private String lastname;
    private int age=0;

    public Person() {
        count++;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception{
        if(age<=0)
            throw new Exception("Invalid Age");
        this.age = age;
    }
}
