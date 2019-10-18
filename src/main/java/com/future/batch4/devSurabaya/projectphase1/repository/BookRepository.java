package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    Book findBookById(String bookId);

    @Transactional
    long deleteBookById(String bookId);
}
