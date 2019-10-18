package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.DetailUserQuestion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DetailUserQuestionRepository extends JpaRepository<DetailUserQuestion, String> {
    DetailUserQuestion findDetailUserQuestionById(String detailUserQuestionId);

    @Transactional
    long deleteDetailUserQuestionById(String detailUserQuestionId);
}
