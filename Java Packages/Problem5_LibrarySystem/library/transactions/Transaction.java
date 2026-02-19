package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    public void issueBook(Book book, Member member) {
        System.out.println("\n--- Issuing Book ---");
        book.displayDetails();
        System.out.println("To:");
        member.displayDetails();
        System.out.println("Status: Book Issued Successfully");
    }

    public void returnBook(Book book, Member member) {
        System.out.println("\n--- Returning Book ---");
        book.displayDetails();
        System.out.println("From:");
        member.displayDetails();
        System.out.println("Status: Book Returned Successfully");
    }
}
