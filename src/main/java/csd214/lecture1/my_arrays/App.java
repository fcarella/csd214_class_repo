/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd214.lecture1.my_arrays;

/**
 *
 * @author students
 */
public class App {

    private int[] intArray = new int[5];
    private double[] doubleArray = new double[5];
    private String[] stringArray = new String[5];
    private MyObject[] myObjectsArray = new MyObject[5];

    void run() {
        // Creates an Object : object1 is a reference to a MyObject object
        // object1 --> []
        MyObject object1=new MyObject();

        // Delete an object
        object1=null;
        System.gc(); // forces a delete of the objects

        // populate intArray
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        // populate doubleArray
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = (double) i + .001;
        }
        // populate stringArray
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = new String("String number " + i);
        }
        // populate array of user defined Objects 
        for (int i = 0; i < myObjectsArray.length; i++) {
            myObjectsArray[i] = new MyObject(i);
        }

        // iterate through arrays of primitives
        //
        // method 1 : iterate through intArray (use index)
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[i] is =" + intArray[i]);
        }
        // method 2 : iterate through intArray (use for each)
        for (int anInt : intArray) {
            System.out.println("next number in intArray is =" + anInt);
        }

        // iterate through arrays of objects
        // method 1 (use index)
        for (int i = 0; i < myObjectsArray.length; i++) {
            System.out.println("myObjectsArray[i].getNumber is =" + myObjectsArray[i].getNumber());
        }
        // method 2 (use for each)
        for (MyObject myObject : myObjectsArray) {
            System.out.println("myObject.getNumber()=" + myObject.getNumber());
        }
        // method 2 (use while)
        int i = 0;
        while (myObjectsArray[i] != null) {
            System.out.println("myObject.getNumber()=" + myObjectsArray[i++].getNumber());
        }
    }

}
