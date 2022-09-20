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
class MyObject {
    private int number=0;

    public MyObject() {
        number=10;
    }

    public MyObject(int number) {
        this.number=number;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }
    
}
