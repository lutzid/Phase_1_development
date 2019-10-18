package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Writer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface WriterRepository extends JpaRepository<Writer, String> {
    Writer findByName(String name);

    @Query("SELECT w " +
            "FROM Writer w " +
            "WHERE w.id = ?1")
    @Transactional
    long deleteByWriterId(String writerId);
}
