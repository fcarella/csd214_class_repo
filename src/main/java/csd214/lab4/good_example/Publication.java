/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd214.lab4.good_example;

import java.util.Scanner;

/**
 *
 * @author fcarella
 */
public abstract class Publication extends Editable {
    // private members of a superclass are not inherited by subclasses, need setters/getters
    private String title;
    private double price;
    private int copies; // how many are currently in stock

    public Scanner input=new Scanner(System.in);

    public Publication() {
    }

    public abstract void edit();
    public abstract void initialize();
    public Publication(String title, Double price, Integer copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }
    
    public void sellCopy(){
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the copies
     */
    public int getCopies() {
        return copies;
    }

    @Override
    public String toString() {
        return "{" + "title=" + title + ", price=" + price + ", copies=" + copies + "}";
    }

    /**
     * @param copies the copies to set
     */
    public void setCopies(int copies) {
        this.copies = copies;
    }



}
