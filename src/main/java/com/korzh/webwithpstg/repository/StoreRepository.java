package com.korzh.webwithpstg.repository;

import com.korzh.webwithpstg.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface StoreRepository extends JpaRepository<Store, Integer> {

    @Query(value = "SELECT * FROM store", nativeQuery = true)
    public List<Store> findAll();
}
