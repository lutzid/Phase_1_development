package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.Review;
import com.future.batch4.devSurabaya.projectphase1.service.ReviewService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class ReviewController {
    @Autowired
    ReviewService reviewService;

    @PostMapping(ApiPath.REVIEW)
    public Review save(@RequestBody Review review){
        return reviewService.save(review);
    }

    @GetMapping(ApiPath.REVIEW_BY_ID)
    public Review findReviewById(@PathVariable String reviewId){
        return reviewService.findReviewById(reviewId);
    }

    @DeleteMapping(ApiPath.REVIEW_BY_ID)
    public boolean deleteReviewById(@PathVariable String reviewId){
        return reviewService.deleteReviewById(reviewId) > 0;
    }
}
