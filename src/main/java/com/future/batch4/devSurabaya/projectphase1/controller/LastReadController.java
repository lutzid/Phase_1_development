package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.LastRead;
import com.future.batch4.devSurabaya.projectphase1.model.entity.Transaction;
import com.future.batch4.devSurabaya.projectphase1.service.LastReadService;
//import com.future.batch4.devSurabaya.projectphase1.service.TransactionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class LastReadController {
    @Autowired
    LastReadService lastreadService;

    @GetMapping(ApiPath.LASTREAD_BY_ID)
    public LastRead findFirstByLastReadId(
            @PathVariable String lastReadId){
        return lastreadService.findLastReadById(lastReadId);
    }

    @PostMapping(ApiPath.LASTREAD)
    public LastRead save(@RequestBody LastRead lastread){
        return lastreadService.save(lastread);
    }

    @DeleteMapping(ApiPath.LASTREAD_BY_ID)
    public boolean deleteByLastReadId(String lastreadId){
        return lastreadService.deleteByLastReadId(lastreadId) > 0;
    }
}
