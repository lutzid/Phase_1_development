package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.Like;
import com.future.batch4.devSurabaya.projectphase1.service.LikeService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class LikeController {
    @Autowired
    LikeService likeService;

    @PostMapping(ApiPath.LIKE)
    public Like save(@RequestBody Like like){
        return likeService.save(like);
    }

    @GetMapping(ApiPath.LIKE_BY_ID)
    public Like findLikeById(@PathVariable String likeId){
        return likeService.findLikeById(likeId);
    }

    @DeleteMapping(ApiPath.LIKE_BY_ID)
    public boolean deleteLikeById(String likeId){
        return likeService.deleteLikeById(likeId) > 0;
    }

    @PutMapping(ApiPath.LIKE_BY_ID)
    public Like update(@PathVariable String likeId, @RequestBody Like like){
        Like newLike = likeService.findLikeById(likeId);

        newLike.setHelp(like.getHelp());
        return likeService.save(newLike);
    }
}
