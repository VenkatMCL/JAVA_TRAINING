package com.training.library.service;

import com.training.library.model.Book;
import com.training.library.util.LibraryData;

public class ReportService {

    // Display Total Number of Books
    public void totalBooks() {

        System.out.println("Total Books : " + LibraryData.books.size());

    }

    // Display Available Books Count
    public void availableBooks() {

        int count = 0;

        for (Book book : LibraryData.books) {

            if (book.isAvailable()) {
                count++;
            }

        }

        System.out.println("Available Books : " + count);

    }

    // Display Borrowed Books Count
    public void borrowedBooks() {

        int count = 0;

        for (Book book : LibraryData.books) {

            if (!book.isAvailable()) {
                count++;
            }

        }

        System.out.println("Borrowed Books : " + count);

    }

    // Display Total Members
    public void totalMembers() {

        System.out.println("Total Members : " + LibraryData.members.size());

    }

    // Display Total Transactions
    public void totalTransactions() {

        System.out.println("Total Transactions : " + LibraryData.transactions.size());

    }

    // Display All Categories
    public void displayCategories() {

        System.out.println("\nBook Categories");

        for (String category : LibraryData.categories) {

            System.out.println(category);

        }

    }

    // Display Complete Library Summary
    public void librarySummary() {

        System.out.println("\n======================================");
        System.out.println("       LIBRARY SUMMARY REPORT");
        System.out.println("======================================");

        totalBooks();
        availableBooks();
        borrowedBooks();
        totalMembers();
        totalTransactions();
        displayCategories();

        System.out.println("======================================");

    }

}