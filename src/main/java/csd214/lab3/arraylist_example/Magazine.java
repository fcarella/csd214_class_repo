/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd214.lab3.arraylist_example;

/**
 *
 * @author fcarella
 */
public class Magazine extends Publication{
    private int orderQty;

    public Magazine() {
    }

    public Magazine(int orderQty) {
        this.orderQty = orderQty;
    }

    public Magazine(int orderQty, String title) {
        super(title);
        this.orderQty = orderQty;
    }

    @Override
    public String toString() {
        return "Magazine ["+getTitle()+"],["+getOrderQty()+"]";

    }

    /**
     * @return the orderQty
     */
    public int getOrderQty() {
        return orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    public void setOrderQty(int orderQty) {
        this.orderQty = orderQty;
    }

    @Override
    public String abstractMethod() {
        return "Magazine: abstractMethod";
    }
    
    public void magazineMethod(){
    }
    
}
