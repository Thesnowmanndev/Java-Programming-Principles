/*
 * This program was written by Kyle Martin on 6/19/2021 for CPT421 Java Programming Principles 1 during Summer Session 1
 * at Southwestern College, Kansas.
 *
 * IMPORTANT: Normally I would not place a bunch of comments in my code describing what my code is doing as I like to
 * have code that is written in a manner to be understandable while reading it. Though, do to the grading rubric I will
 * explain my code.
 *
 * This program was created to complete exercise 2 of Algorithm Workshop
 * See Chapter 6 Algorithm Workshop Exercise 2
 */
public class Book {
    private String title;
    private String author;
    private String publisher;
    private int copiesSold;

    // Constructor
    public Book (String cover, String auth, String pub, int copies) {
        title = cover;
        author = auth;
        publisher = pub;
        copiesSold = copies;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getCopiesSold() {
        return copiesSold;
    }

    // Setters
    public void setTitle(String titleName) {
        title = titleName;
    }
    public void setAuthor(String authorName) {
        author = authorName;
    }
    public void setPublisher(String publisherName) {
        publisher = publisherName;
    }
    public void setCopiesSold(int numberOfCopiesSold) {
        copiesSold = numberOfCopiesSold;
    }
}

