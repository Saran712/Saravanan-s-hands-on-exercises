package com.library.LibraryManangement1.service.BookService;

import com.library.LibraryManangement1.repository.BookRepository;

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
