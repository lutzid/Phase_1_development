package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.LastRead;
import com.future.batch4.devSurabaya.projectphase1.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface LastReadRepository extends JpaRepository <LastRead, String> {
    @Query("SELECT l " +
            "FROM LastRead l " +
            "JOIN FETCH l.user " +
            "WHERE l.user = ?1")
    LastRead findLastReadByOwnerUsername(String username);

    LastRead findLastReadById(String lastReadId);

    @Query("SELECT l " +
            "FROM LastRead l " +
            "WHERE l.id = ?1")
    @Transactional
    long deleteByLastReadId(String lastreadId);
}
