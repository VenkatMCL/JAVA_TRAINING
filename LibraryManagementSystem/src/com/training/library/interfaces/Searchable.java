package com.training.library.interfaces;

import com.training.library.model.Book;

public interface Searchable {

    Book searchById(int bookId);

    Book searchByTitle(String title);

}