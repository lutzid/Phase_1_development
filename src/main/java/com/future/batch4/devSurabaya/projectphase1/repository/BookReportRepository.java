package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.BookReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface BookReportRepository extends JpaRepository<BookReport, String> {
    BookReport findByBookId(String id);

    @Query("SELECT br " +
            "FROM BookReport br " +
            "WHERE br.id = ?1")
    @Transactional
    long deleteByBookReportId(String bookreportId);
}
