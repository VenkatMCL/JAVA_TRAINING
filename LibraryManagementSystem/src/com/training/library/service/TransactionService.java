package com.training.library.service;

import java.time.LocalDate;

import com.training.library.model.Transaction;
import com.training.library.util.LibraryData;

public class TransactionService {

    private static int transactionCounter = 1001;

    // Record Borrow
    public void recordBorrowTransaction(int memberId,
                                        int bookId) {

        Transaction transaction = new Transaction();

        transaction.setTransactionId(transactionCounter++);
        transaction.setMemberId(memberId);
        transaction.setBookId(bookId);
        transaction.setBorrowDate(LocalDate.now());
        transaction.setReturnDate(null);
        transaction.setStatus("BORROWED");

        LibraryData.transactions.add(transaction);

        System.out.println("Borrow Transaction Recorded.");

    }

    // Record Return
    public void recordReturnTransaction(int memberId,
                                        int bookId) {

        for (Transaction transaction :
                LibraryData.transactions) {

            if (transaction.getBookId() == bookId &&
                transaction.getMemberId() == memberId &&
                transaction.getStatus().equals("BORROWED")) {

                transaction.setReturnDate(LocalDate.now());

                transaction.setStatus("RETURNED");

                System.out.println("Return Transaction Recorded.");

                return;
            }

        }

        System.out.println("Transaction Not Found.");

    }

    // Display All Transactions
    public void displayTransactions() {

        if (LibraryData.transactions.isEmpty()) {

            System.out.println("No Transactions Found.");

            return;

        }

        for (Transaction transaction :
                LibraryData.transactions) {

            transaction.displayTransaction();

        }

    }

    // Search Transaction
    public Transaction searchTransaction(int transactionId) {

        for (Transaction transaction :
                LibraryData.transactions) {

            if (transaction.getTransactionId()
                    == transactionId) {

                return transaction;

            }

        }

        return null;

    }

}