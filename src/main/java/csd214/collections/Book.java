/* Book example used in HashMap example
 * See this for notes on handling ISBN numbers
 * https://howtodoinjava.com/java/regex/java-regex-validate-international-standard-book-number-isbn_10s/
 */
package csd214.collections;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author fcarella
 */
public class Book {
    private String isbn_10;
    private String author;
    private String title;
    // the regex for isbn_10 10
    private String regex = "^(?:ISBN(?:-10)?:? )?(?=[0-9X]{10}$|(?=(?:[0-9]+[- ]){3})[- 0-9X]{13}$)[0-9]{1,5}[- ]?[0-9]+[- ]?[0-9]+[- ]?[0-9X]$";
    private Pattern pattern = Pattern.compile(regex);

    public Book() {
    }

    public Book(String isbn_10, String author, String title) throws Exception {
        validateISBN(isbn_10, title);
        this.isbn_10 = isbn_10;
        this.author = author;
        this.title = title;
    }
    
    
    
    private void validateISBN(String isbn_10, String title) throws Exception{
        Matcher matcher = getPattern().matcher(isbn_10);
//        System.out.println(matcher.matches());
        if(!matcher.matches()){
            throw new Exception("Book Titled "+title+" has Invalid ISBN");
        }
    }

    @Override
    public String toString() {
        return title+", by "+author;
    }

    /**
     * @return the isbn_10
     */
    public String getIsbn_10() {
        return isbn_10;
    }

    /**
     * @param isbn_10 the isbn_10 to set
     */
    public void setIsbn_10(String isbn_10) {
        this.isbn_10 = isbn_10;
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

    /**
     * @return the regex
     */
    public String getRegex() {
        return regex;
    }

    /**
     * @param regex the regex to set
     */
    public void setRegex(String regex) {
        this.regex = regex;
    }

    /**
     * @return the pattern
     */
    public Pattern getPattern() {
        return pattern;
    }

    /**
     * @param pattern the pattern to set
     */
    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }
    
}
