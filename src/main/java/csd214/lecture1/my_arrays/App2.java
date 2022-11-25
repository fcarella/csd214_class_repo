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
public class App2 {
    // declare arrays of primitive types
    // declare an array of int's
    private int[] intArray=new int[10];
    private double[] doubleArray=new double[10];
    
    // number of names defined as a constant
    private final int NUM_NAMES=10;
    // declare arrays of Object types
    private String[] names=new String[NUM_NAMES];
    
    // declare array of MyObject objects.
    // sets aside space for 10 references to 10 objects of type MyObject
    private MyObject[] myObjects=new MyObject[10];

    void run() {
        // populate intArray
        for(int i=0;i<10;i++){
            intArray[i]=i;
        }
        // iterate through an array
        for(int i=0;i<10;i++){
            System.out.println("intArray[i]="+intArray[i]);
        }
        // populate intArray
        for(int i=0;i<10;i++){
            doubleArray[i]=(double)i;
        }
        // iterate through an array
        for(int i=0;i<10;i++){
            System.out.println("doubleArray[i]="+doubleArray[i]);
        }
        // iterate through an array using a "for each loop"
        for(int x:intArray){
            System.out.println("for each element in intArray="+x);
        }
        for(double x:doubleArray){
            System.out.println("for each element in doubleArray="+x);
        }
        
        // populate (initialize) a String array
        for(int i=0;i<names.length;i++){
            names[i]="name "+i;
        }
        for(int i=0;i<10;i++){
            System.out.println("names[i]="+names[i]);
        }
        
        for(String name:names){
            System.out.println("names[i]="+name);
        }
        

        // populate MyObjects
        for(int i=0;i<myObjects.length;i++){
            myObjects[i]=new MyObject(i);
        }
        System.out.println("myObject[0]"+myObjects[0].getNumber());
        
        
    }
    
}
