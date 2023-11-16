/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd214.lab4_gui_example;

class Book extends Publication {
    public Book(String title, double price, int copies) {
        super(title, price, copies);
    }

    @Override
    public void initialize(String title, double price, int copies) {
        setTitle(title);
        setPrice(price);
        setCopies(copies);
    }

    @Override
    public void edit(String title, double price, int copies) {
        setTitle(title);
        setPrice(price);
        setCopies(copies);
    }
}
