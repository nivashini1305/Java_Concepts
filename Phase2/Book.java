package Phase2;

import java.util.ArrayList;
import java.util.Scanner;

public class Book {
    String bookTitle;
    String author;
    String ISBN;
    int availabilityStatus;

    public Book(String bookTitle, String author, String ISBN, int availabilityStatus) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.ISBN = ISBN;
        this.availabilityStatus = availabilityStatus;
    }

    public String getBookTitle() {
        return bookTitle;
    }
    public String getAuthor() {
        return author;
    }

    public void setAvailabilityStatus(int availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    public int getAvailabilityStatus() {
        return availabilityStatus;
    }
    public String getISBN() {
        return ISBN;
    }

}
