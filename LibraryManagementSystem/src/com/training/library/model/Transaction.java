package com.training.library.model;

import java.time.LocalDate;

public class Transaction {

    private int transactionId;
    private int memberId;
    private int bookId;
    private LocalDate borrowDate;
    private LocalDate returnDate;
    private String status;

    public Transaction() {

    }

    public Transaction(int transactionId,
                       int memberId,
                       int bookId,
                       LocalDate borrowDate,
                       LocalDate returnDate,
                       String status) {

        this.transactionId = transactionId;
        this.memberId = memberId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public int getMemberId() {
        return memberId;
    }

    public int getBookId() {
        return bookId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBorrowDate(LocalDate borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displayTransaction() {

        System.out.println("-------------------------------");
        System.out.println("Transaction Id : " + transactionId);
        System.out.println("Member Id      : " + memberId);
        System.out.println("Book Id        : " + bookId);
        System.out.println("Borrow Date    : " + borrowDate);
        System.out.println("Return Date    : " + returnDate);
        System.out.println("Status         : " + status);
    }

}