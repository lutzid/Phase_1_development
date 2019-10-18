package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.DetailUserQuestion;
import com.future.batch4.devSurabaya.projectphase1.repository.DetailUserQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailUserQuestionService {
    @Autowired
    DetailUserQuestionRepository detailUserQuestionRepository;

    public DetailUserQuestion findByDetailUserQuestionId(String detailUserQuestionId){
        return detailUserQuestionRepository.findDetailUserQuestionById(detailUserQuestionId);
    }

    public DetailUserQuestion save(DetailUserQuestion detailUserQuestion){
        return detailUserQuestionRepository.save(detailUserQuestion);
    }

    public long deleteByDetailUserQuestionId(String detailUserQuestionId){
        return detailUserQuestionRepository.deleteDetailUserQuestionById(detailUserQuestionId);
    }
}
