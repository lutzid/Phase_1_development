package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.Writer;
import com.future.batch4.devSurabaya.projectphase1.service.WriterService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class WriterController {
    @Autowired
    WriterService writerService;

    @PostMapping(ApiPath.WRITER)
    public Writer save(@RequestBody Writer writer){
        return writerService.save(writer);
    }

    @GetMapping(ApiPath.WRITER_BY_NAME)
    public Writer findByName(@PathVariable String name){
        return writerService.findByName(name);
    }

    @DeleteMapping(ApiPath.WRITER_BY_ID)
    public boolean deleteByWriterId(@PathVariable String writerId){
        return writerService.deleteByWriterId(writerId) > 0;
    }
}
