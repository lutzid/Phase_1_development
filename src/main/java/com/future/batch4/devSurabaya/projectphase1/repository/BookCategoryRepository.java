package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Book;
import com.future.batch4.devSurabaya.projectphase1.model.entity.BookCategory;
import com.future.batch4.devSurabaya.projectphase1.model.entity.DetailBookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface BookCategoryRepository extends JpaRepository <BookCategory, String> {
    BookCategory findBookCategoryById(String bookCategoryId);

    @Transactional
    long deleteBookCategoryById(String bookCategoryId);
}
