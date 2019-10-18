package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.DetailTransaction;
import com.future.batch4.devSurabaya.projectphase1.service.DetailTransactionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class DetailTransactionController {
    @Autowired
    DetailTransactionService detailTransactionService;

    @PostMapping(ApiPath.DETAILTRANSACTION)
    public DetailTransaction save(@RequestBody DetailTransaction detailTransaction){
        return detailTransactionService.save(detailTransaction);
    }

    @GetMapping(ApiPath.DETAILTRANSACTION_BY_ID)
    public DetailTransaction findDetailTransactionById(@PathVariable String detailTransactionId){
        return detailTransactionService.findDetailTransactionById(detailTransactionId);
    }

    @DeleteMapping(ApiPath.DETAILTRANSACTION_BY_ID)
    public boolean deleteDetailTransactionById(@PathVariable String detailTransactionId){
        return detailTransactionService.deleteDetailTransactionById(detailTransactionId) > 0;
    }
}
