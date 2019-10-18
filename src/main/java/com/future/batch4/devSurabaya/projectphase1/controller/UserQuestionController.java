package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.UserQuestion;
import com.future.batch4.devSurabaya.projectphase1.service.UserQuestionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class UserQuestionController {
    @Autowired
    UserQuestionService userQuestionService;

    @GetMapping(ApiPath.USERQUESTION_BY_ID)
    public UserQuestion findByUserQuestionId(@PathVariable String userQuestionId){
        return userQuestionService.findUserQuestionById(userQuestionId);
    }

    @PostMapping(ApiPath.USERQUESTION)
    public UserQuestion save(@RequestBody UserQuestion userQuestion){
        return userQuestionService.save(userQuestion);
    }

    @DeleteMapping(ApiPath.USERQUESTION_BY_ID)
    public boolean deleteByUserQuestionId(@PathVariable String userQuestionId){
        return userQuestionService.deleteByUserQuestionId(userQuestionId) > 0;
    }
}
