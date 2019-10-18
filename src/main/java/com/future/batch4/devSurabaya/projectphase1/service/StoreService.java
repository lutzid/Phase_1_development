package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Store;
import com.future.batch4.devSurabaya.projectphase1.repository.StoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreService {
    @Autowired
    private StoreRepository storeRepository;

    public Store findByOwnerUsername(String username){
        return storeRepository.findByStoreOwnerUsername(username);
    }

    public Store findByOwnerName(String name){
        return storeRepository.findByStoreOwnerName(name);
    }

    public Store findByStoreName(String name){
        //kurang logic
        return storeRepository.findByStoreName(name);
    }

    public Store save(Store newStore){
        Store store = storeRepository.save(newStore);
        return store;
    }

    public long deleteStoreById(String id){
        return storeRepository.deleteStoreById(id);
    }

    public List<Store> findAll(){
        return storeRepository.findAll();
    }

/*    public Store findOne(String id){
        return storeRepository.findOne(id);
    }*/
}
