package com.ly.spring.test.controller;

import com.ly.spring.test.entity.User;
import com.ly.spring.test.sercice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public User addUser(User user) throws Exception {
        return userService.addUser(user);
    }
}
