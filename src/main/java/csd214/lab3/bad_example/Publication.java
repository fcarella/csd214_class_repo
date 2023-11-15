/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd214.lab3.bad_example;

/**
 *
 * @author fcarella
 */
public class Publication {
    // private members of a superclass are not inherited by subclasses, need setters/getters
    private String title;
    private Double price;
    private Integer copies; // how many are currently in stock

    public Publication() {
    }

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
    public Double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(Double price) {
        this.price = price;
    }

    /**
     * @return the copies
     */
    public Integer getCopies() {
        if(copies==null)
            copies=new Integer(0);
        return copies;
    }

    @Override
    public String toString() {
        return "Publication{" + "title=" + title + ", price=" + price + ", copies=" + copies + "} : "+super.toString();
    }

    /**
     * @param copies the copies to set
     */
    public void setCopies(Integer copies) {
        this.copies = copies;
    }
}
