/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd214.lab4.good_example;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author fcarella
 */
public class Magazine extends Publication {
    private Integer orderQty;
    private Date currIssue;
    

    public Magazine(String title, Date currIssue, Double price, Integer copies) {
        this(); // call constructor to set default order quantity
        setTitle(title);
        setPrice(price);
        setCopies(copies);
        setCurrIssue(currIssue);
    }

    public Magazine() {
        orderQty=10;// default order quantity
    }

    /**
     * @return the orderQty
     */
    public Integer getOrderQty() {
        return orderQty;
    }

    /**
     * @param orderQty the orderQty to set
     */
    public void setOrderQty(Integer orderQty) {
        this.orderQty = orderQty;
    }

    /**
     * @return the currIssue
     */
    public Date getCurrIssue() {
        return currIssue;
    }

    /**
     * @param currIssue the currIssue to set
     */
    public void setCurrIssue(Date currIssue) {
        this.currIssue = currIssue;
    }

//    @Override
//    public String toString() {
//        return "Magazine{" + "orderQty=" + orderQty + ", currIssue=" + currIssue + "}" + super.toString();
//    }
//
//    

    @Override
    public String toString() {
        return "Magazine{" +
                "orderQty=" + orderQty +
                ", currIssue=" + currIssue + " "+
                super.toString()+"} ";
    }

    @Override
    public void edit() {
        input = new Scanner(System.in); // reset the scanner
        System.out.println("Title: " + getTitle());
        setTitle(getInput(getTitle()));
        System.out.println("Date of Current Issue (dd-MMM-yyyy): " + getCurrIssue());
        setCurrIssue(getInput(getCurrIssue()));
        System.out.println("Price: " + getPrice());
        setPrice(getInput(getPrice()));
        System.out.println("Copies: " + getCopies());
        setCopies(getInput(getCopies()));
    }




    @Override
    public void initialize() {
        input = new Scanner(System.in); // reset the scanner
        System.out.println("Enter a new Magazine");
        System.out.println("Title: ");
        setTitle(getInput(getTitle()));
        System.out.println("Date of Current Issue (dd-MMM-yyyy): ");
        setCurrIssue(getInput(getCurrIssue()));
        System.out.println("Price: ");
        setPrice(getInput(getPrice()));
        System.out.println("Copies: ");
        setCopies(getInput(getCopies()));
        System.out.println("Order Qty: ");
        setOrderQty(getInput(getOrderQty()));
    }
}
