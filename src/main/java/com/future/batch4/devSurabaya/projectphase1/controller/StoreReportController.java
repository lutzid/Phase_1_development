package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.StoreReport;
import com.future.batch4.devSurabaya.projectphase1.service.StoreReportService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class StoreReportController {
    @Autowired
    StoreReportService storeReportService;

    @PostMapping(ApiPath.STOREREPORT)
    public StoreReport save(@RequestBody StoreReport storeReport){
        return storeReportService.save(storeReport);
    }

    @GetMapping(ApiPath.STOREREPORT_BY_ID)
    public StoreReport findStoreReportById(@PathVariable String storeReportId){
        return storeReportService.findStoreReportById(storeReportId);
    }

    @DeleteMapping(ApiPath.STOREREPORT_BY_ID)
    public boolean deleteStoreReportById(@PathVariable String storeReportId){
        return storeReportService.deleteStoreReportById(storeReportId) > 0;
    }
}
