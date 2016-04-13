package com.jpa.data.service;

import com.jpa.data.Repository.BooksRepository;
import com.jpa.data.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author dmalladi
 */

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    private BooksRepository  booksRepository;

    public List<Book> findAll() {
        return booksRepository.findAll();
    }

    public Book findOne(int id) {
        return booksRepository.findOne(id);
    }

    public List<Book> findByName(String name) {
        return booksRepository.findByName(name);
    }

    public List<Book> findByPrice(int price) {
        return booksRepository.findByPrice(price);
    }

    public void saveBook(Book book) {
        booksRepository.save(book);
    }

    public void deleteBook(int id) {
        booksRepository.delete(id);
    }

}
