package com.jpa.data.Repository;

import com.jpa.data.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author dmalladi
 */
public interface BooksRepository extends JpaRepository<Book,Integer> {

    List<Book> findByName(String name);
    List<Book> findByPrice(int price);
}
