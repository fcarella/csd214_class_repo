package csd214.lab4.good_example;

import java.util.Scanner;

public class Comic extends Publication{
    private String title;
    private String illustrator;

    public Comic() {
        this.title = "no title";
        this.illustrator = "no illustrator";
    }
    public Comic(String title, String illustrator) {
        this.title = title;
        this.illustrator = illustrator;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    public String getIllustrator() {
        return illustrator;
    }

    public void setIllustrator(String illustrator) {
        this.illustrator = illustrator;
    }

    @Override
    public void edit() {
        input = new Scanner(System.in); // reset the scanner
        System.out.println("Title: " + getTitle());
        setTitle(getInput(getTitle()));
        System.out.println("Illustrator: " + getIllustrator());
        setIllustrator(getInput(getIllustrator()));
        System.out.println("Price: " + getPrice());
        setPrice(getInput(getPrice()));
        System.out.println("Copies: " + getCopies());
        setCopies(getInput(getCopies()));
    }




    @Override
    public void initialize() {
//        input = new Scanner(System.in); // reset the scanner
        System.out.println("Enter a new book");
        System.out.println("Title: ");
        setTitle(getInput(getTitle()));
        System.out.println("Illustrator: ");
        setIllustrator(getInput(getIllustrator()));
        System.out.println("Price: ");
        setPrice(getInput(getPrice()));
        System.out.println("Copies: ");
        setCopies(getInput(getCopies()));
    }

    @Override
    public String toString() {
        return "Comic{" +
                "title='" + title + '\'' +
                ", illustrator='" + illustrator + '\'' +
                '}';
    }
}
