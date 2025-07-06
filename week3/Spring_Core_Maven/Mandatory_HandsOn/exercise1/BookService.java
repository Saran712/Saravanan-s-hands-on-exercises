package com.library.LibraryManagement.service.BookService;

import com.library.LibraryManagement.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println(bookRepository.getBookData());
    }
}