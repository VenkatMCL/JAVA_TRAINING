package com.training.library.app;

import com.training.library.exception.BookNotFoundException;
import com.training.library.exception.MemberNotFoundException;
import com.training.library.model.Book;
import com.training.library.model.Member;
import com.training.library.service.BookService;
import com.training.library.service.MemberService;
import com.training.library.service.ReportService;
import com.training.library.service.TransactionService;

public class LibraryApp {

    public static void main(String[] args) {

        BookService bookService = new BookService();
        MemberService memberService = new MemberService();
        TransactionService transactionService = new TransactionService();
        ReportService reportService = new ReportService();

        // -----------------------------
        // Create Books
        // -----------------------------

        Book book1 = new Book(
                101,
                "Java Programming",
                "James Gosling",
                "Programming",
                799,
                true);

        Book book2 = new Book(
                102,
                "Spring Boot",
                "Rod Johnson",
                "Programming",
                999,
                true);

        Book book3 = new Book(
                103,
                "Python",
                "Guido Van Rossum",
                "Programming",
                699,
                true);

        bookService.addBook(book1);
        bookService.addBook(book2);
        bookService.addBook(book3);

        // -----------------------------
        // Register Members
        // -----------------------------

        Member member1 = new Member(
                1,
                "Venkat",
                "venkat@gmail.com",
                "9876543210",
                0);

        Member member2 = new Member(
                2,
                "Rahul",
                "rahul@gmail.com",
                "9999999999",
                0);

        memberService.registerMember(member1);
        memberService.registerMember(member2);

        // -----------------------------
        // Display Books
        // -----------------------------

        System.out.println("\nALL BOOKS");

        bookService.displayAllBooks();

        // -----------------------------
        // Borrow Book
        // -----------------------------

        bookService.borrowBook(1, 101);

        transactionService.recordBorrowTransaction(1,101);

        // -----------------------------
        // Return Book
        // -----------------------------

        bookService.returnBook(1,101);

        transactionService.recordReturnTransaction(1,101);

        // -----------------------------
        // Search Book
        // -----------------------------

        try {

            Book book = bookService.searchById(101);

            if(book != null) {

                System.out.println("\nBOOK FOUND");

                book.displayBook();

            }

        }

        catch(Exception e) {

            System.out.println(e.getMessage());

        }

        // -----------------------------
        // Search Member
        // -----------------------------

        try {

            Member member = memberService.searchMember(1);

            System.out.println("\nMEMBER FOUND");

            member.displayMember();

        }

        catch(MemberNotFoundException e) {

            System.out.println(e.getMessage());

        }

        // -----------------------------
        // Transactions
        // -----------------------------

        System.out.println("\nTRANSACTIONS");

        transactionService.displayTransactions();

        // -----------------------------
        // Reports
        // -----------------------------

        reportService.librarySummary();

    }

}