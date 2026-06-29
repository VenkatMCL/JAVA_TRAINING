package com.training.library.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import com.training.library.model.Book;
import com.training.library.model.Member;
import com.training.library.model.Transaction;

public class LibraryData {

    // Stores all books
    public static ArrayList<Book> books = new ArrayList<>();

    // Stores all members
    public static HashMap<Integer, Member> members = new HashMap<>();

    // Stores all borrow/return transactions
    public static ArrayList<Transaction> transactions = new ArrayList<>();

    // Stores unique book categories
    public static HashSet<String> categories = new HashSet<>();

}