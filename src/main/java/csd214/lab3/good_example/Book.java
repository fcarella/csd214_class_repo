/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd214.lab3.good_example;

import java.util.Scanner;

/**
 *
 * @author fcarella
 */
public class Book extends Publication {
    private String author;

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, String author, double price, int copies) {
        super(title, price, copies);
        this.author = author;
    }
    
    public void orderCopies(int num2Order){
        setCopies(num2Order+getCopies());
    }

//    @Override
//    public String toString() {
//        return "Book{" + "author=" + author + "} : "+ super.toString();
//    }
//

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                super.toString()+"} ";
    }

    @Override
    public void edit() {
        input = new Scanner(System.in); // reset the scanner
        System.out.println("Title: " + getTitle());
        setTitle(getInput(getTitle()));
        System.out.println("Author: " + getAuthor());
        setAuthor(getInput(getAuthor()));
        System.out.println("Price: " + getPrice());
        setPrice(getInput(getPrice()));
        System.out.println("Copies: " + getCopies());
        setCopies(getInput(getCopies()));
    }




    @Override
    public void initialize() {
        input = new Scanner(System.in); // reset the scanner
        System.out.println("Enter a new book");
        System.out.println("Title: ");
        setTitle(getInput(getTitle()));
        System.out.println("Author: ");
        setAuthor(getInput(getAuthor()));
        System.out.println("Price: ");
        setPrice(getInput(getPrice()));
        System.out.println("Copies: ");
        setCopies(getInput(getCopies()));
    }
}
