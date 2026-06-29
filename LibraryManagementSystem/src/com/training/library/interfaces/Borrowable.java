package com.training.library.interfaces;

public interface Borrowable {

    void borrowBook(int memberId, int bookId);

    void returnBook(int memberId, int bookId);

}