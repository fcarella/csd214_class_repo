package csd214.f24.lab1.lecture_examples._05_app_skeleton;//package csd214.f24.lab1.lecture_examples._05_app_skeleton;

//import java.util.Objects;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private int pageCount;

    // Constructors, getters, and setters

    public Book() {
        this.isbn = "isbn";
        this.title = "title";
        this.author = "author";
        this.pageCount = 0;
    }

    public Book(String title, String author, String isbn, int pageCount) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pageCount == book.pageCount && Objects.equals(isbn, book.isbn) && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, title, author, pageCount);
    }

    // toString method for easy printing
    @Override
    public String toString() {
        String s1=String.format("Title: %-30s",title);
        String s2=String.format("Author: %-20s",author);
        String s3=String.format("Pages: %-4s",pageCount);
        String s4=String.format("ISBN: %-20s",isbn);
        return s1+s2+s3+s4;
//        return "Title: " + title + ", Author: " + author + ", Pages: " + pageCount+ ", ISBN: " + isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
