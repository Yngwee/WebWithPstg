package com.korzh.webwithpstg.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

@Entity
@Table(name="books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private int year;

    @Column
    private double price;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    @JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
    private Author author_id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "publisher_id")
    @JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
    private Publisher publisher_id;



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor_id() {
        return author_id;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public Publisher getPublisher_id() {
        return publisher_id;
    }
}
