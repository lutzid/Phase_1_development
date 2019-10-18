package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.LastRead;
import com.future.batch4.devSurabaya.projectphase1.repository.LastReadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LastReadService {
    @Autowired
    private LastReadRepository lastreadRepository;

    public LastRead findLastReadById(String lastReadId){
        return lastreadRepository.findLastReadById(lastReadId);
    }

    public LastRead save(LastRead lastread){
        return lastreadRepository.save(lastread);
    }

    public long deleteByLastReadId(String lastreadId){
        return lastreadRepository.deleteByLastReadId(lastreadId);
    }
}
