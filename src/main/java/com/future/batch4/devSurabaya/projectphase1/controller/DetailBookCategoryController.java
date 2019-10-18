package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.DetailBookCategory;
import com.future.batch4.devSurabaya.projectphase1.service.DetailBookCategoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class DetailBookCategoryController {
    @Autowired
    DetailBookCategoryService detailBookCategoryService;

    @PostMapping(ApiPath.DETAILBOOKCATEGORY)
    public DetailBookCategory save(@RequestBody DetailBookCategory detailBookCategory){
        return detailBookCategoryService.save(detailBookCategory);
    }

    @GetMapping(ApiPath.DETAILBOOKCATEGORY_BY_NAME)
    public DetailBookCategory findByName(@PathVariable String name){
        return detailBookCategoryService.findByName(name);
    }

    @DeleteMapping(ApiPath.DETAILBOOKCATEGORY_BY_ID)
    public boolean deleteByDbcId(@PathVariable String dbcId){
        return detailBookCategoryService.deleteByDbcId(dbcId) > 0;
    }
}
