package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.Store;
import com.future.batch4.devSurabaya.projectphase1.service.StoreService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class StoreController {
    @Autowired
    private StoreService storeService;

    @GetMapping(ApiPath.STORE_BY_ID)
    public Store findByStoreName(@PathVariable String name){
        return storeService.findByStoreName(name);
    }

    @PostMapping(ApiPath.STORE)
    public Store save(@RequestBody Store store) throws Exception {
        return storeService.save(store);
    }

    @DeleteMapping(ApiPath.STORE_BY_ID)
    public boolean deleteStoreById(@PathVariable String storeId) {
        return storeService.deleteStoreById(storeId) > 0;
    }
}
