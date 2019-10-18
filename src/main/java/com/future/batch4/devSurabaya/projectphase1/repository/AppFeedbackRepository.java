package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.AppFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AppFeedbackRepository extends JpaRepository<AppFeedback, String> {
    @Query("SELECT af " +
            "FROM AppFeedback af " +
            "WHERE af.id = ?1")
    AppFeedback findByAppFeedbackId(String appfeedbackId);

    AppFeedback findByTitle(String title);

    @Transactional
    long deleteAppFeedbackById(String appfeedbackId);

}
