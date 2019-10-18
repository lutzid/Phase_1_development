package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.BookCategory;
import com.future.batch4.devSurabaya.projectphase1.service.BookCategoryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class BookCategoryController {
    @Autowired
    private BookCategoryService bookCategoryService;

    @PostMapping(ApiPath.BOOKCATEGORY)
    public BookCategory save(@RequestBody BookCategory bookCategory) throws Exception{
        return bookCategoryService.save(bookCategory);
    }

    @GetMapping(ApiPath.BOOKCATEGORY_BY_ID)
    public BookCategory findBookCategoryById(@PathVariable String bookCategoryId){
        return bookCategoryService.findByBookCategoryId(bookCategoryId);
    }

    @DeleteMapping(ApiPath.BOOKCATEGORY_BY_ID)
    public boolean deleteBookCategoryById(String bookCategoryId){
        return bookCategoryService.deleteBookCategoryById(bookCategoryId) > 0;
    }
}
