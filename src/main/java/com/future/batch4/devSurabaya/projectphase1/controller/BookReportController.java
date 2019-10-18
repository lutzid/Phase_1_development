package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.BookReport;
import com.future.batch4.devSurabaya.projectphase1.service.BookReportService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class BookReportController {
    @Autowired
    BookReportService bookReportService;

    @PostMapping(ApiPath.BOOKREPORT)
    public BookReport save(@RequestBody BookReport bookReport){
        return bookReportService.save(bookReport);
    }

    @GetMapping(ApiPath.BOOKREPORT_BY_ID)
    public BookReport findByBookReportId(@PathVariable String bookreportId){
        return bookReportService.findByBookId(bookreportId);
    }

    @DeleteMapping(ApiPath.BOOKREPORT_BY_ID)
    public boolean deleteByBookReportId(@PathVariable String bookreportId){
        return bookReportService.deleteByBookReportId(bookreportId) > 0;
    }
}
