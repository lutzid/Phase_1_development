package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Transaction;
import com.future.batch4.devSurabaya.projectphase1.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionRepository transactionRepository;

    public List<Transaction> findTransactionByOwnerUsername(String username){
        return transactionRepository.findTransactionByOwnerUsername(username);
    }

    public Transaction findByTransactionId(String transactionId){
        return transactionRepository.findByTransactionId(transactionId);
    }

    public Transaction save(Transaction transaction){
        return transactionRepository.save(transaction);
    }

    public long deleteTransactionById(String transactionId){
        return transactionRepository.deleteTransactionById(transactionId);
    }
}
