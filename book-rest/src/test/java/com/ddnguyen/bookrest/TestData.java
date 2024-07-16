package com.ddnguyen.bookrest;

import com.ddnguyen.bookrest.domain.Book;
import com.ddnguyen.bookrest.domain.BookEntity;

public final class TestData {

    private TestData() {

    }

    public static Book testBook() {
        return Book.builder()
                .isbn("02345678")
                .author("Stephen King")
                .title("Lord Of The Ring")
                .build();
    }

    public static BookEntity testBookEntity() {
        return BookEntity.builder()
                .isbn("02345678")
                .author("Stephen King")
                .title("Lord Of The Ring")
                .build();
    }
}
