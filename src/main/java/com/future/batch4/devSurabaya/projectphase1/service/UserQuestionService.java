package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.UserQuestion;
import com.future.batch4.devSurabaya.projectphase1.repository.UserQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserQuestionService {
    @Autowired
    UserQuestionRepository userQuestionRepository;

    public UserQuestion findUserQuestionById(String userQuestionId){
        return userQuestionRepository.findUserQuestionById(userQuestionId);
    }

    public UserQuestion save(UserQuestion userQuestion){
        return userQuestionRepository.save(userQuestion);
    }

    public long deleteByUserQuestionId(String userQuestionId){
        return userQuestionRepository.deleteUserQuestionById(userQuestionId);
    }
}
