package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.Transaction;

import com.future.batch4.devSurabaya.projectphase1.service.TransactionService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class TransactionController {
    @Autowired
    private TransactionService transactionService;

    @GetMapping(ApiPath.TRANSACTION_BY_ID)
    public Transaction findByTransactionId(
            @PathVariable String transactionId){
        return transactionService.findByTransactionId(transactionId);
    }

    @PostMapping(ApiPath.TRANSACTION)
    public Transaction save(@RequestBody Transaction transaction){
        return transactionService.save(transaction);
    }

    @DeleteMapping(ApiPath.TRANSACTION_BY_ID)
    public boolean deleteTransactionById(String transactionId){
        return transactionService.deleteTransactionById(transactionId) > 0;
    }
}
