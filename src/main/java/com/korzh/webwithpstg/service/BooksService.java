package com.korzh.webwithpstg.service;

import com.korzh.webwithpstg.entity.Books;
import com.korzh.webwithpstg.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    private final BooksRepository booksRepository;

    @Autowired
    public BooksService(BooksRepository booksRepository) {
        this.booksRepository = booksRepository;
    }

    public List<Books> findAll() {
        return booksRepository.findAll();
    }

}
