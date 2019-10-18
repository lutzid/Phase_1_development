package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.AppFeedback;
import com.future.batch4.devSurabaya.projectphase1.repository.AppFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppFeedbackService {
    @Autowired
    private AppFeedbackRepository appFeedbackRepository;

    public AppFeedback findByAppFeedbackId (String appfeedbackId){
        return appFeedbackRepository.findByAppFeedbackId(appfeedbackId);
    }

    public AppFeedback findByAppTitle(String title){
        return appFeedbackRepository.findByTitle(title);
    }

    public AppFeedback save(AppFeedback appFeedback){
        return appFeedbackRepository.save(appFeedback);
    }

    public long deleteByAppFeedbackId(String appfeedbackId){
        return appFeedbackRepository.deleteAppFeedbackById(appfeedbackId);
    }

    public List<AppFeedback> findAll(){
        return appFeedbackRepository.findAll();
    }
}
