package com.ddnguyen.bookrest.rspositories;

import com.ddnguyen.bookrest.domain.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Create an entry for Spring context
public interface BookRepositories extends JpaRepository<BookEntity, String> {

}
