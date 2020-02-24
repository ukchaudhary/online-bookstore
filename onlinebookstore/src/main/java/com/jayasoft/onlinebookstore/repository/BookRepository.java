package com.jayasoft.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayasoft.onlinebookstore.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Long>{

}
