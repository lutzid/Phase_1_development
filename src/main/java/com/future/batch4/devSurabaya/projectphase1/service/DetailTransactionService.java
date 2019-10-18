package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.DetailTransaction;
import com.future.batch4.devSurabaya.projectphase1.repository.DetailTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailTransactionService {
    @Autowired
    private DetailTransactionRepository detailTransactionRepository;

    public DetailTransaction findDetailTransactionById(String detailTransactionId){
        return detailTransactionRepository.findDetailTransactionById(detailTransactionId);
    }

    public DetailTransaction save(DetailTransaction detailTransaction ){
        return detailTransactionRepository.save(detailTransaction);
    }

    public long deleteDetailTransactionById(String detailTransactionId){
        return detailTransactionRepository.deleteDetailTransactionById(detailTransactionId);
    }

//    public List<DetailTransaction> findAll(){
//        return detailTransaksiRepository.findAll();
//    }
}
