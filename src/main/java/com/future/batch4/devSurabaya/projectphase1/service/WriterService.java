package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Writer;
import com.future.batch4.devSurabaya.projectphase1.repository.WriterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WriterService {
    @Autowired
    private WriterRepository writerRepository;

    public Writer findByName(String name){
        //kurang logic
        return writerRepository.findByName(name);
    }

    public Writer save(Writer writer){
        return writerRepository.save(writer);
    }

    public long deleteByWriterId(String writerId){
        return writerRepository.deleteByWriterId(writerId);
    }
/*
    public List<Writer> findAll(){
        return writerRepository.findAll();
    }

    public Writer findOne(String id) {
        return writerRepository.findOne(id);
    }*/
}
