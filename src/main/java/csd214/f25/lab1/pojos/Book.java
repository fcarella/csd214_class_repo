//package csd214.ai.bookstore.lab1;

// Assume a package for organization
package csd214.f25.lab1.pojos;

import java.util.Objects;

// <<interface>> Serializable
// we are going to use java's serializable interface, this is here for documentation purposes only
//interface Serializable {
//    // Typically a marker interface, or could have methods if specified
//}

public class Book extends Publication {
    private String author;

    public Book() {
        super();
    }

    public Book(String author) {
        super(); // Call default constructor of Publication
        this.author = author;
    }
    public Book(String author, String title) {
        super(title); // Call default constructor of Publication
        this.author = author;
    }




    public Book(String author, String title, double price, int copies) {
        super(title, price, copies);
        this.author = author;
    }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    @Override
    public void edit() {
        System.out.println("--- Editing Book: " + getTitle() + " ---");
        setTitle(getInput("Enter new title [" + getTitle() + "]"));
        setAuthor(getInput("Enter new author [" + this.author + "]"));
        try {
            setPrice(Double.parseDouble(getInput("Enter new price [" + getPrice() + "]")));
            setCopies(Integer.parseInt(getInput("Enter new copies [" + getCopies() + "]")));
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format. Values not changed for price/copies.");
        }
        System.out.println("Book updated.");
    }

    @Override
    public void initialize() {
        System.out.println("--- Initializing New Book ---");
        setTitle(getInput("Enter title"));
        setAuthor(getInput("Enter author"));
        try {
            setPrice(Double.parseDouble(getInput("Enter price")));
            setCopies(Integer.parseInt(getInput("Enter copies")));
        } catch (NumberFormatException e) {
            System.err.println("Invalid number format. Using 0 for price/copies.");
            setPrice(0.0);
            setCopies(0);
        }
        System.out.println("Book initialized.");
    }

    @Override
    public void sellItem() {
        if (getCopies() > 0) {
            setCopies(getCopies() - 1);
            System.out.println("Sold Book: '" + getTitle() + "' by " + author + ". Copies left: " + getCopies());
        } else {
            System.out.println("Book '" + getTitle() + "' is out of stock.");
        }
    }

    @Override
    public String toString() {
        return "Book [author='" + author + '\'' + ", " + super.toString() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), author);
    }
}

