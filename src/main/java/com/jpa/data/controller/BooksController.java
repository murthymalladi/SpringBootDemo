package com.jpa.data.controller;

import com.jpa.data.domain.Book;
import com.jpa.data.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author dmalladi
 */

@RestController
public class BooksController {

     @Autowired
     private BookService bookService;

    @RequestMapping(value="/books")
    public List<Book> getBooks () {
        return bookService.findAll();
    }

    @RequestMapping(value="/add/{id}/{name}/{price}")
    public Book addBook(@PathVariable int id, @PathVariable String name, @PathVariable int price ) {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setPrice(price);

        bookService.saveBook(book);
        return book;
    }

    @RequestMapping(value = "/delete/{id}")
    public void deleteBook(@PathVariable int id) {
        bookService.deleteBook(id);
    }

    @RequestMapping(value="/findById/{id}")
    public Book findBookById(@PathVariable int id) {
        return bookService.findOne(id);
    }


}
