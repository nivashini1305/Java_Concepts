package Phase2;

import java.util.Scanner;

public class LibraryActions {
    public static void start(){
        while (true){
            System.out.println("1.Add a book \n2.Remove a book\n3.Search a book\n4.Borrow a book\n5.Display details of the book\n6.Operations to do in Digital books\n7.Exit");
            Scanner sc = new Scanner(System.in);
            int input= sc.nextInt();
            switch(input){
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
                    borrowBook();
                    break;
                case 5:
                     displayDetails();
                     break;
                case 6:
                    DigitalLibrary.EBook();
                    break;
                case 7:
                    System.exit(0);
            }
        }
    }
            public static void addBook()
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("How many books you want to add:");
                int n = sc.nextInt();
                for (int i = 0; i <n; i++) {
                    System.out.print("Book name:");
                    String name = sc.next();
                    System.out.print("Book author:");
                    String author = sc.next();
                    System.out.print("ISBN:");
                    String isbn = sc.next();
                    for (Book books : Library.getBookArrayList()) {
                        if (books.bookTitle.equals(name)) {
                            int count = books.getAvailabilityStatus();
                            books.setAvailabilityStatus(count + 1);
                            System.out.println("The total number of "+name+" book is "+books.getAvailabilityStatus());
                            return;
                        }
                    }
                    Book newBook = new Book(name, author, isbn, 1);
                    Library.getBookArrayList().add(newBook);
                    System.out.println("Book added successfully");
                }
            }
            public static void remove() {
                    Scanner sc = new Scanner(System.in);
                    for(Book book:Library.getBookArrayList()){
                        System.out.println(book.bookTitle);
                    }
                    System.out.println("Enter the book name to remove:");
                    String bookName=sc.nextLine();
                    for (Book books : Library.getBookArrayList()) {
                        if (books.bookTitle.equals(bookName)) {
                            Library.getBookArrayList().remove(books);
                            break;
                        }
                        else{
                            System.out.println("Not found");
                            break;
                        }
                    }
                }
    public static void searchBook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the book name to search:");
        String bookName=sc.next();
        for (Book books : Library.getBookArrayList()) {
            if(books.bookTitle.equals(bookName)){
                System.out.println("The book"+bookName+" was available");
                break;
            }
            else{
                System.out.println("Not found");
                break;
            }
        }
    }
    public static void borrowBook()
    {
       Scanner sc= new Scanner(System.in);
        System.out.println("Available Books:");
        for(Book book:Library.getBookArrayList()){
            System.out.println(book.bookTitle+"- count:"+book.getAvailabilityStatus());
        }
        System.out.print("Enter the book name to borrow:");
        String borrowBook=sc.nextLine();
        for(Book books:Library.getBookArrayList()){
           if(borrowBook.equals(books.bookTitle)){
               int count=books.getAvailabilityStatus();
               books.setAvailabilityStatus(count-1);
               System.out.println(borrowBook+" book has been borrowed");
               break;
           }
           else {
               System.out.println("No books found");
               break;
           }
       }
    }
            public static void displayDetails(){
                for(Book book:Library.getBookArrayList())
                {
                    System.out.println("Book Name: "+book.bookTitle+"\nAuthor name:"+book.author+"\nISBN:"+book.ISBN+"\nAvailability status:"+book.availabilityStatus);
                    System.out.println("-------------------------------");
                }
            }
        }




