//package csd214.ai.bookstore.lab1;

// Assume a package for organization
package csd214.f25.lab1.pojos;

import java.io.Serializable;
import java.util.Objects;

// <<interface>> Serializable
// we are going to use java's serializable interface, this is here for documentation purposes only
//interface Serializable {
//    // Typically a marker interface, or could have methods if specified
//}

// <<Abstract>> Publication
abstract class Publication extends Editable implements SaleableItem, Serializable {
    private String title;
    private double price;
    private int copies;

    public Publication() {
        // Default constructor
    }
    public Publication(String title) {
        // Default constructor
        this.title = title;
    }

    public Publication(String title, double price, int copies) {
        this.title = title;
        this.price = price;
        this.copies = copies;
    }

    @Override
    public double getPrice() {
        return price;
    }

    // sellItem() is part of SaleableItem.
    // Since Publication is abstract and Book/Magazine implement it,
    // we can make it abstract here or provide a default.
    // Given Book/Magazine define it, let's make it abstract here.
    @Override
    public abstract void sellItem();


    // Getters and Setters (or use initialize/edit)
    public String getTitle() { return title; }
    protected void setTitle(String title) { this.title = title; }
    protected void setPrice(double price) { this.price = price; } // Price might be set during edit
    public int getCopies() { return copies; }
    protected void setCopies(int copies) { this.copies = copies; }


    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", price=" + price +
                ", copies=" + copies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return Double.compare(that.price, price) == 0 &&
                copies == that.copies &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, copies);
    }
}

