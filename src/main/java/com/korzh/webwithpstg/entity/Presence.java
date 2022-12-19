package com.korzh.webwithpstg.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "presence")
public class Presence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Store id_store;

    @ManyToOne
    @JoinColumn(name = "id_book")
    private Books id_book;

    public Long getId() {
        return id;
    }

    public Books getId_book() {
        return id_book;
    }

    public Store getId_store() {
        return id_store;
    }
}
