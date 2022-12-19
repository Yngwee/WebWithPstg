package com.korzh.webwithpstg.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "publisher")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String publisher_name;

    @Column
    private String address;

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getPublisher_name() {
        return publisher_name;
    }
}
