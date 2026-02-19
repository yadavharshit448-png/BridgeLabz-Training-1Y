import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class MainLibrary {
    public static void main(String[] args) {
        System.out.println("Problem 5: Library Management System");

        // 1. Adding a new book
        Book book = new Book("The Alchemist", "Paulo Coelho", "978-0062315007");

        // 2. Registering a new member
        Member member = new Member("John Doe", "M001");

        // 3. Issuing a book to a member
        Transaction transaction = new Transaction();
        transaction.issueBook(book, member);
        
        // Return book
        transaction.returnBook(book, member);
    }
}
