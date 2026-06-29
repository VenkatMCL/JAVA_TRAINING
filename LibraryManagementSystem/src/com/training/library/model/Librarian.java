package com.training.library.model;

public class Librarian {

    private int librarianId;
    private String librarianName;
    private String email;

    public Librarian() {

    }

    public Librarian(int librarianId,
                     String librarianName,
                     String email) {

        this.librarianId = librarianId;
        this.librarianName = librarianName;
        this.email = email;
    }

    public int getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(int librarianId) {
        this.librarianId = librarianId;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayLibrarian() {

        System.out.println("-------------------------------");
        System.out.println("Librarian Id   : " + librarianId);
        System.out.println("Name           : " + librarianName);
        System.out.println("Email          : " + email);
    }

}