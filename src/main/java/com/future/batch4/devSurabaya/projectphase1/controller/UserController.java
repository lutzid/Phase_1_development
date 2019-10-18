package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.User;
import com.future.batch4.devSurabaya.projectphase1.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(ApiPath.USER_BY_NAME)
    public User findByName(@PathVariable String name){
        return userService.findByName(name);
    }

    @PostMapping(value = ApiPath.USER)
    public User save(@RequestBody User user) throws Exception {
        return userService.save(user);
    }

    @DeleteMapping(ApiPath.USER_BY_ID)
    public boolean deleteUserById(@PathVariable String userId) {
        return userService.deleteUserById(userId) > 0;
    }
}
