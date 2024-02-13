package com.example.newbook.repository;


import com.example.newbook.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book, Long>{
}