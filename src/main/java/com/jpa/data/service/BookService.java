package com.jpa.data.service;

import com.jpa.data.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dmalladi
 */


public interface BookService {

    public List<Book> findAll();
    public void saveBook(Book book);
    public Book findOne(int id);
    public List<Book> findByName(String name);
    public List<Book> findByPrice(int price);
    public void deleteBook(int id);

}
