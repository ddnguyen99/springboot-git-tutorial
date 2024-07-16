package com.ddnguyen.bookrest.service.impl;

import com.ddnguyen.bookrest.rspositories.BookRepositories;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class BookServiceImpTest {
    @Mock
    private BookRepositories bookRepositories;

    @InjectMocks
    private BookServiceImpl underTest;


}
