package com.library.LibraryManangement.service;

import com.library.LibraryManangement.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String libraryName;

    public BookService(String libraryName) {
        this.libraryName = libraryName;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println("Library: " + libraryName);
        System.out.println(bookRepository.getBookData());
    }
}
