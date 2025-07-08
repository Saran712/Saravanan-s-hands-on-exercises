package com.library.librarymanagement2.repository;

import com.library.librarymanagement2.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
