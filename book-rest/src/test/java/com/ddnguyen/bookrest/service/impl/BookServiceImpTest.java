package com.ddnguyen.bookrest.service.impl;

import com.ddnguyen.bookrest.domain.Book;
import com.ddnguyen.bookrest.domain.BookEntity;
import com.ddnguyen.bookrest.rspositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BookServiceImpTest {
    @Mock
    private BookRepository bookRepository;

    @InjectMocks
    private BookServiceImpl underTest;

    @Test
    public void testBookServiceImpl() {
        final Book book = Book.builder()
                .isbn("02345678")
                .author("Stephen King")
                .title("Lord Of The Ring")
                .build();

        final BookEntity bookEntity = BookEntity.builder()
                .isbn("02345678")
                .author("Stephen King")
                .title("Lord Of The Ring")
                .build();

        when(bookRepository.save(bookEntity)).thenReturn(bookEntity);

        final Book result = underTest.create(book);

        assertEquals(book, result);
    }
}
