package com.korzh.webwithpstg.repository;

import com.korzh.webwithpstg.entity.Presence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PresenceRepository extends JpaRepository<Presence, Integer> {

    @Query(value = "SELECT * FROM presence", nativeQuery = true)
    public List<Presence> findAll();
}
