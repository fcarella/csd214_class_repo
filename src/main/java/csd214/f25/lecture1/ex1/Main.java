package csd214.f25.lecture1.ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // primitive data type
        int num=10;
        double weight=100.2;
        float height=125.8f;
        char a='a';

        // reference types
        Integer numI=10;
        Double weightI=100.2;
        Double heightI=125.8;


        MyNumber num1 = new MyNumber();
        MyNumber num2 = num1;

        num2.setNum(29);

        num2=null;
        num1=null;

        Integer[] nums=new Integer[3];

        System.out.println("num="+num+ " num1="+num1.num);


    }
}
