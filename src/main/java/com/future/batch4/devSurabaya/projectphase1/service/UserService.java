package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.User;
import com.future.batch4.devSurabaya.projectphase1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findByName(String name){
        //kurang logic
        return userRepository.findByName(name);
    }

    public User save(User newUser){
        User user = userRepository.save(newUser);
        return user;
    }

    public long deleteUserById(String userId){
        return userRepository.deleteUserById(userId);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
/*
    public User findOne(String id) {
        return userRepository.findOne(id);
    }*/
}
