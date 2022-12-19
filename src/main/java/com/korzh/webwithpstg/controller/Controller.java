package com.korzh.webwithpstg.controller;

import com.korzh.webwithpstg.entity.Author;
import com.korzh.webwithpstg.entity.Books;
import com.korzh.webwithpstg.entity.Publisher;
import com.korzh.webwithpstg.entity.Store;
import com.korzh.webwithpstg.service.AuthorService;
import com.korzh.webwithpstg.service.BooksService;
import com.korzh.webwithpstg.service.PublisherService;
import com.korzh.webwithpstg.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
    private BooksService booksService;

    private PublisherService publisherService;

    private AuthorService authorService;
    private StoreService storeService;

    @Autowired
    public void setStoreService(StoreService storeService) {
        this.storeService = storeService;
    }
    @Autowired
    public void setBooksService(BooksService booksService) {
        this.booksService = booksService;
    }
    @Autowired
    public void setAuthorService(AuthorService authorService) {
        this.authorService = authorService;
    }
    @Autowired
    public void setPublisherService(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping("/books")
    public List<Books> findAllBooks() {
        return booksService.findAll();
    }

    @GetMapping("/authors")
    public List<Author> findAllAuthors() {
        return authorService.findAll();
    }

    @GetMapping("/publisher")
    public List<Publisher> findAllPublisher() {
        return publisherService.findAll();
    }

    @GetMapping("/store")
    public List<Store> findAllStore() {
        return storeService.findAll();
    }
}
