package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.StoreReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StoreReportRepository extends JpaRepository<StoreReport, String> {
    StoreReport findStoreReportById(String storeReportId);

    @Transactional
    long deleteStoreReportById(String storeReportId);
}
