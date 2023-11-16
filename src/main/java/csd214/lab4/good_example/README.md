# bad example
- the bad example uses multiple ArrayLists, one for every type of publication.  This is bad design
```java
ArrayList<Publication> pubs=new ArrayList<>();
ArrayList<Book> books=new ArrayList<>();
ArrayList<Magazine> magazines=new ArrayList<>();
```
- to fix it,
  - make Publication abstract by adding 2 methods.  This makes any Publication responsible for its own editing and initialization (when adding a new instance)
  - ```java
    public abstract void edit();
    public abstract void initialize();
    ```
- create a superclass for Publication called Editable which contains utility methods for getting input.  This makes all Publictions editable
- now theres only one ArrayList required 
```java
private ArrayList<Publication> pubs=new ArrayList<>();
```
- I will go over this in class