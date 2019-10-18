package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Like;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface LikeRepository extends JpaRepository<Like, String> {
    Like findLikeById(String likeId);

    @Transactional
    long deleteLikeById(String likeId);
}
