package guvi.task3;

import java.util.Scanner;

public class Library {
    private Book[] books;
    private int bookCount = 0;

    public Library() {
        this.books = new Book[5];  // You can change the size or use ArrayList for more flexibility
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;  // Increment bookCount after adding a book
        } else {
            System.out.println("Library is full");
        }
    }

    public void replaceBook(int bookID) {
        boolean bookFound = false;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < bookCount; i++) {
            if (books[i].getBookID() == bookID) {
                System.out.println("Enter the new book title:");
                books[i].setTitle(sc.nextLine());
                System.out.println("Enter the new book author:");
                books[i].setAuthor(sc.nextLine());
                System.out.println("Enter the book's availability (Yes or No):");
                String available = sc.nextLine().toLowerCase();

                if (available.equals("yes")) {
                    books[i].setAvailable(true);
                } else {
                    books[i].setAvailable(false);
                }

                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("Book not found");
        }
    }

    public void displayBooks() {
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Book ID: " + books[i].getBookID());
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Available: " + (books[i].isAvailable() ? "Yes" : "No"));
            System.out.println("______________________");
        }
    }
}
