package Phase2;

import java.util.Scanner;

public class DigitalLibrary extends LibraryActions{
    public static void EBook(){
        while (true) {
            System.out.println("1.Add a book \n2.Remove a book\n3.Search a book\n4.Display details of the book\n5.Download the book\n6.Exit");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    addBook();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    displayDetails();
                    break;
                case 5:
                    downloadBook();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }
    public static  void downloadBook(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the book to download");
        String downloadBook = sc.next();
        for(Book book:Library.getBookArrayList()){
            if(book.bookTitle.equals(downloadBook)){
                System.out.println("Book downloaded successfully");
            }
            else {
                System.out.println("Book not found");
            }
        }
    }
}
