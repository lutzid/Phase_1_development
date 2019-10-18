package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.StoreReport;
import com.future.batch4.devSurabaya.projectphase1.repository.StoreReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreReportService {
    @Autowired
    StoreReportRepository storeReportRepository;

    public StoreReport save(StoreReport storeReport){
        return storeReportRepository.save(storeReport);
    }

    public StoreReport findStoreReportById(String storeReportId){
        return storeReportRepository.findStoreReportById(storeReportId);
    }

    public long deleteStoreReportById(String storeReportId){
        return storeReportRepository.deleteStoreReportById(storeReportId);
    }
}
