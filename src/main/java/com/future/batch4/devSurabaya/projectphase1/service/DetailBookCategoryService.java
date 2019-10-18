package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.BookCategory;
import com.future.batch4.devSurabaya.projectphase1.model.entity.DetailBookCategory;
import com.future.batch4.devSurabaya.projectphase1.repository.DetailBookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailBookCategoryService {
    @Autowired
    DetailBookCategoryRepository detailBookCategoryRepository;

    public DetailBookCategory findByName(String name){
        return detailBookCategoryRepository.findByName(name);
    }

    public DetailBookCategory save(DetailBookCategory detailBookCategory){
        return detailBookCategoryRepository.save(detailBookCategory);
    }

    public long deleteByDbcId(String dbcId){
        return detailBookCategoryRepository.deleteByDbcId(dbcId);
    }
}
