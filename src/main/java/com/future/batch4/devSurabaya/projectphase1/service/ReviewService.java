package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Review;
import com.future.batch4.devSurabaya.projectphase1.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository reviewRepository;

    public Review findReviewById(String reviewId){
        return reviewRepository.findReviewById(reviewId);
    }

    public Review save(Review review){
        return reviewRepository.save(review);
    }

    public long deleteReviewById(String reviewId){
        return reviewRepository.deleteReviewById(reviewId);
    }
}
