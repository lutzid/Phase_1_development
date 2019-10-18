package com.future.batch4.devSurabaya.projectphase1.repository;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository <Transaction, String> {
    @Query("SELECT t " +
            "FROM Transaction t " +
            "JOIN User u " +
            "ON u.username = t.user " +
            "WHERE t.user = ?1")
    List<Transaction> findTransactionByOwnerUsername(String username);

    @Query("SELECT t " +
            "FROM Transaction t " +
            "WHERE t.id = ?1")
    Transaction findByTransactionId(String transactionId);

    @Transactional
    long deleteTransactionById(String transactionId);
}
