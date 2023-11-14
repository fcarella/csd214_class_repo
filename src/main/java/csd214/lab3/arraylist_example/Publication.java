/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package csd214.lab3.arraylist_example;

/**
 *
 * @author fcarella
 */
public abstract class Publication {
    private String title;

    public abstract String abstractMethod();
    
    public Publication() {
        this.title="no title";
    }

    public Publication(String title) {
        this.title = title;
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

    @Override
    public String toString() {
        return "Publication: ["+getTitle()+"]"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
