package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Like;
import com.future.batch4.devSurabaya.projectphase1.repository.LikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
    @Autowired
    LikeRepository likeRepository;

    public Like save(Like like){
        return likeRepository.save(like);
    }

    public Like findLikeById(String likeId){
        return likeRepository.findLikeById(likeId);
    }

    public long deleteLikeById(String likeId){
        return likeRepository.deleteLikeById(likeId);
    }
}
