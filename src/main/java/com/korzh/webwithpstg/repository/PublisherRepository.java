package com.korzh.webwithpstg.repository;

import com.korzh.webwithpstg.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PublisherRepository extends JpaRepository<Publisher, Integer> {

    @Query(value = "SELECT * FROM publisher", nativeQuery = true)
    public List<Publisher> findAll();
}
