package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.AppFeedback;
import com.future.batch4.devSurabaya.projectphase1.service.AppFeedbackService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class AppFeedbackController {
    @Autowired
    private AppFeedbackService appFeedbackService;

//    @GetMapping(ApiPath.APPFEEDBACK_BY_ID)
//    public AppFeedback findByAppFeedbackId(@PathVariable String appfeedbackId) {
//        return appFeedbackService.findByAppFeedbackId(appfeedbackId);
//    }

    @GetMapping(ApiPath.APPFEEDBACK_BY_TITLE)
    public AppFeedback findByAppTitle(@PathVariable String title) {
        return appFeedbackService.findByAppTitle(title);
    }

    @PostMapping(ApiPath.APPFEEDBACK)
    public AppFeedback save(@RequestBody AppFeedback appFeedback) throws Exception {
        return appFeedbackService.save(appFeedback);
    }

    @DeleteMapping(ApiPath.APPFEEDBACK_BY_ID)
    public boolean deleteByAppFeedbackId(@PathVariable String appfeedbackId) {
        return appFeedbackService.deleteByAppFeedbackId(appfeedbackId) > 0;
    }
}
