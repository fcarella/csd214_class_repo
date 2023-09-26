package csd214.lecture1.f23.day4.quiz_review;

public class Main {
    public int getY(){
        return this.y;
    }
    public static void main(String[] args) {
        // Use the debugger and observe the values of the references (not the value of the object but of the reference
        // references, null
        Double d1=Double.valueOf(2.2);
        Double d2=new Double(2.2);
        Double d3=new Double(3.3);
        Double d4;


        boolean b1   =   d1==d2; // INCORRECT: It's false.  Should be true
        boolean b2   =   d1.equals(d2); // CORRECT:  this is the correct way to test for equality
        boolean b3   =   d1==d3; // CORRECT: its FALSE
        d3=2.2;
        boolean b4   =   d1==d3; // INCORRECT: should be true but it evaluates to false.

        d4=d1;
        boolean b5   =   d1==d4; // TRUE but should it be?
        boolean b6   =   d1.equals(d4); // TRUE but should it be?

        d1=null;

        System.gc();// force garbage collection so the object d1 used to point to is no longer taking up resources.

        int x=10;

    }
    private int y;
}
