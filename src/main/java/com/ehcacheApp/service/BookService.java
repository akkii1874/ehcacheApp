package com.ehcacheApp.service;

import com.ehcacheApp.entity.Book;
import org.springframework.stereotype.Service;

@Service
public interface BookService {

    Book addBook(Book book);

    Book updateBook(Book book);

    Book getBook(long id);

    String deleteBook(long id);
}
