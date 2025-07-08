package com.library.LibraryManagement.repository;

import com.library.LibraryManagement.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // ✅ Setter-based Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println(bookRepository.getBookData());
    }
}