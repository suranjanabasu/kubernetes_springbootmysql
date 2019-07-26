package com.kubernetesTest.testfabric8.repository;


import com.kubernetesTest.testfabric8.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book, String> {
}
