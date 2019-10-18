package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.UserQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface UserQuestionRepository extends JpaRepository<UserQuestion, String> {
    @Query(
        " SELECT uq " +
        " FROM UserQuestion uq" +
        " WHERE uq.id = ?1 " )
    UserQuestion findByUserQuestionId(String uqId);

    UserQuestion findUserQuestionById(String userQuestionId);

    @Transactional
    long deleteUserQuestionById(String userQuestionId);
}
