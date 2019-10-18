package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.DetailUserQuestion;
import com.future.batch4.devSurabaya.projectphase1.service.DetailUserQuestionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class DetailUserQuestionController {

    @Autowired
    DetailUserQuestionService detailUserQuestionService;

    @GetMapping(ApiPath.DETAILUSERQUESTION_BY_ID)
    public DetailUserQuestion findByDetailUserQuestionId(@PathVariable String detailUserQuestionId){
        return detailUserQuestionService.findByDetailUserQuestionId(detailUserQuestionId);
    }

    @PostMapping(ApiPath.DETAILUSERQUESTION)
    public DetailUserQuestion save(@RequestBody DetailUserQuestion detailUserQuestion){
        return detailUserQuestionService.save(detailUserQuestion);
    }

    @DeleteMapping(ApiPath.DETAILUSERQUESTION_BY_ID)
    public boolean deleteByDetailUserQuestionId(@PathVariable String detailUserQuestionId){
        return detailUserQuestionService.deleteByDetailUserQuestionId(detailUserQuestionId) > 0;
    }
}
