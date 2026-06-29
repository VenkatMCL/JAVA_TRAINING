package com.training.library.model;

public class Book {

    private int bookId;
    private String title;
    private String author;
    private String category;
    private double price;
    private boolean available;

    // Default Constructor
    public Book() {

    }

    // Parameterized Constructor
    public Book(int bookId, String title, String author,
            String category, double price, boolean available) {

        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    // Getters

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setters

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // Display Method

    public void displayBook() {

        System.out.println("-------------------------------");
        System.out.println("Book Id      : " + bookId);
        System.out.println("Title        : " + title);
        System.out.println("Author       : " + author);
        System.out.println("Category     : " + category);
        System.out.println("Price        : " + price);
        System.out.println("Available    : " + available);
    }

}