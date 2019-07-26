package com.kubernetesTest.testfabric8.controller;


import com.kubernetesTest.testfabric8.entity.Book;
import com.kubernetesTest.testfabric8.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookservice;

    @GetMapping("/books")
    public List getAllBooks() {
        return bookservice.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable("id") String bookId){
        return bookservice.getBook(bookId);
    }

    @PostMapping("/books")
    public void addBook(@RequestBody Book book) {
        bookservice.addBook(book);
    }

    @PutMapping("/books/{id}")
    public void updateBook(@PathVariable String bookId, @RequestBody Book book) {
        bookservice.updateBook(bookId, book);
    }

    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable String bookId) {
        bookservice.deleteBook(bookId);
    }
}
