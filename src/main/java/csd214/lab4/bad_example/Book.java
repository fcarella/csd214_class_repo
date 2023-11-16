/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd214.lab4.bad_example;

/**
 *
 * @author fcarella
 */
public class Book extends Publication {
    private String author;

    public Book() {
    }

    public Book(String title, String author, Double price, Integer copies) {
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
                "} IS A " + super.toString();
    }
}
