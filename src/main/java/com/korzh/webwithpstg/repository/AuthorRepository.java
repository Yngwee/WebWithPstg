package com.korzh.webwithpstg.repository;

import com.korzh.webwithpstg.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Query(value = "SELECT * FROM author", nativeQuery = true)
    public List<Author> findAll();
}
