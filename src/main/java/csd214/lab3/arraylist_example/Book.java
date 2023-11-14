/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd214.lab3.arraylist_example;

/**
 *
 * @author fcarella
 */
public class Book extends Publication{
    private String author;

    public Book() {
        this.author="no author";
    }

    public Book(String author, String title) {
        super(title);
        this.author = author;
    }
    
    public void bookMethod(){
    
    };

    @Override
    public String toString() {
        return "Book ["+getTitle()+"],["+getAuthor()+"]";
    }

    
    
    
    
    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String abstractMethod() {
        return "Book: abstractMethod";

    }
    
}
