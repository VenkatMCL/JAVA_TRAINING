package com.training.library.service;

import java.util.Iterator;

import com.training.library.exception.BookNotFoundException;
import com.training.library.exception.BookUnavailableException;
import com.training.library.interfaces.Borrowable;
import com.training.library.interfaces.Reportable;
import com.training.library.interfaces.Searchable;
import com.training.library.model.Book;
import com.training.library.util.LibraryData;

public class BookService
implements Borrowable,
           Searchable,
           Reportable {
	
	public void addBook(Book book) {

	    LibraryData.books.add(book);

	    LibraryData.categories.add(book.getCategory());

	    System.out.println("Book Added Successfully.");

	}
	
	@Override
	public void displayAllBooks() {

	    if (LibraryData.books.isEmpty()) {

	        System.out.println("No Books Available.");

	        return;

	    }

	    for (Book book : LibraryData.books) {

	        book.displayBook();

	    }

	}
	
	@Override
	public Book searchById(int bookId) {

	    for (Book book : LibraryData.books) {

	        if (book.getBookId() == bookId) {

	            return book;

	        }

	    }

	    return null;

	}
	
	@Override
	public Book searchByTitle(String title) {

	    for (Book book : LibraryData.books) {

	        if (book.getTitle().equalsIgnoreCase(title)) {

	            return book;

	        }

	    }

	    return null;

	}
	
	public void removeBook(int bookId)
	        throws BookNotFoundException {

	    Iterator<Book> iterator =
	            LibraryData.books.iterator();

	    while (iterator.hasNext()) {

	        Book book = iterator.next();

	        if (book.getBookId() == bookId) {

	            iterator.remove();

	            System.out.println("Book Removed Successfully.");

	            return;

	        }

	    }

	    throw new BookNotFoundException(
	            "Book ID " + bookId + " not found.");

	}
	
	@Override
	public void borrowBook(int memberId, int bookId) {

	    Book book = searchById(bookId);

	    if (book == null) {

	        System.out.println("Book Not Found.");

	        return;

	    }

	    if (!book.isAvailable()) {

	        System.out.println("Book Already Issued.");

	        return;

	    }

	    book.setAvailable(false);

	    System.out.println("Book Borrowed Successfully.");

	}
	
	@Override
	public void returnBook(int memberId,
	                       int bookId) {

	    Book book = searchById(bookId);

	    if (book == null) {

	        System.out.println("Book Not Found.");

	        return;

	    }

	    book.setAvailable(true);

	    System.out.println("Book Returned Successfully.");

	}
	
	@Override
	public void displayAvailableBooks() {

	    for (Book book : LibraryData.books) {

	        if (book.isAvailable()) {

	            book.displayBook();

	        }

	    }

	}
	
	@Override
	public void displayBorrowedBooks() {

	    for (Book book : LibraryData.books) {

	        if (!book.isAvailable()) {

	            book.displayBook();

	        }

	    }

	}
}