package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.DetailBookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DetailBookCategoryRepository extends JpaRepository <DetailBookCategory, String> {
    DetailBookCategory findByName(String name);

    @Query("SELECT dbc " +
            "FROM DetailBookCategory dbc " +
            "WHERE dbc.id = ?1")
    @Transactional
    long deleteByDbcId(String dbcId);
}
