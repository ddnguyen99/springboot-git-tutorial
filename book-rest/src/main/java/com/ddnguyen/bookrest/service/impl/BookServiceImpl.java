package com.ddnguyen.bookrest.service.impl;

import com.ddnguyen.bookrest.domain.Book;
import com.ddnguyen.bookrest.domain.BookEntity;
import com.ddnguyen.bookrest.rspositories.BookRepository;
import com.ddnguyen.bookrest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepositories;

    @Autowired
    public BookServiceImpl (final BookRepository bookRepositories) {
        this.bookRepositories = bookRepositories;
    }

    public BookRepository getBookRepositories() {
        return bookRepositories;
    }

    @Override
    public Book create(final Book book) {
       final BookEntity bookEntity = bookToBookEntity(book);
       final BookEntity saveBookEntity = bookRepositories.save(bookEntity);
       return bookEntityToBook(saveBookEntity);
    }

    private BookEntity bookToBookEntity(Book book) {
        return BookEntity.builder()
                .isbn(book.getIsbn())
                .title(book.getTitle())
                .author(book.getAuthor())
                .build();
    }

    private Book bookEntityToBook(BookEntity bookEntity) {
        return Book.builder()
                .isbn(bookEntity.getIsbn())
                .title(bookEntity.getTitle())
                .author(bookEntity.getAuthor())
                .build();
    }

}
