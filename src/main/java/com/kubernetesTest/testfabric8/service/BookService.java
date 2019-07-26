package com.kubernetesTest.testfabric8.service;

import com.kubernetesTest.testfabric8.entity.Book;
import com.kubernetesTest.testfabric8.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List getAllBooks() {
        List books = new ArrayList<>();
        bookRepository.findAll().forEach(books::add);
        return books;
    }

    public Book getBook(String id) {
        return bookRepository.findById(id).orElseGet(Book::new);
    }

    public void addBook(Book whiskey) {
        bookRepository.save(whiskey);
    }

    public void updateBook(String id, Book whiskey) {
        bookRepository.save(whiskey);
    }

    public void deleteBook(String id) {
        bookRepository.deleteById(id);
    }

}
