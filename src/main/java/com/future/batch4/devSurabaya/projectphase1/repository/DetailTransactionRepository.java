package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.DetailTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface DetailTransactionRepository extends JpaRepository<DetailTransaction, String> {
//    @Query("SELECT dt " +
//            "FROM detailtransaction dt " +
//            "JOIN transaction t " +
//            "ON dt.transactionId = t.Id " +
//            "WHERE dt.transactionId = ?1")
//    DetailTransaction findByTransactionId(String id);

    DetailTransaction findDetailTransactionById(String detailTransactionId);

    @Transactional
    long deleteDetailTransactionById(String detailTransactionId);
}
