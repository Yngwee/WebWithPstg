package com.korzh.webwithpstg.repository;

import com.korzh.webwithpstg.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BooksRepository extends JpaRepository<Books, Integer>{

    @Query(value = "SELECT * FROM books", nativeQuery = true)
    List<Books> findAll();


}
