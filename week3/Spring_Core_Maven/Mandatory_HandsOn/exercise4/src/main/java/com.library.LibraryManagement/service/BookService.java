package com.library.LibraryManagements.repository;

import com.library.LibraryManagements.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println(bookRepository.getBookData());
    }
}
