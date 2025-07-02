package guvi.task3;

import java.util.Scanner;

public class BookManagementSystem {
    public static void main(String[] args) {
        Library li = new Library();  // Initialize the library
        Scanner sc = new Scanner(System.in);
        String choice;

        // Add books to the library
        do {
            // Create a new book instance
            Book bk = new Book();

            // Get book details from the user
            System.out.println("Enter the book id :");
            bk.setBookID(sc.nextInt());
            sc.nextLine();  // Consume the newline character left by nextInt()

            System.out.println("Enter the book title:");
            bk.setTitle(sc.nextLine());

            System.out.println("Enter the Author:");
            bk.setAuthor(sc.nextLine());

            // Ask for book availability
            System.out.println("Is the book available? (Yes or No):");
            String availability = sc.nextLine().toLowerCase();
            bk.setAvailable(availability.equals("yes"));  // Set availability based on user input

            // Add the book to the library
            li.addBook(bk);

            // Ask the user if they want to add another book
            System.out.println("Do you want to add another book? (Yes or No)");
            choice = sc.nextLine().toLowerCase();

        } while (choice.equals("yes"));  // Continue adding books if the user says "yes"

        // Display all books in the library
        System.out.println("\nDisplaying all books in the library:");
        li.displayBooks();

        // Option to replace a book (by ID)
        System.out.println("\nDo you want to replace a book? (Yes or No)");
        String replaceChoice = sc.nextLine().toLowerCase();
        if (replaceChoice.equals("yes")) {
            System.out.println("Enter the ID of the book you want to replace:");
            int bookID = sc.nextInt();
            sc.nextLine();  // Consume newline
            li.replaceBook(bookID);  // Replace the book with the provided ID

            // Display the books again after replacement
            System.out.println("\nUpdated books list after replacement:");
            li.displayBooks();
        }
    }
}
