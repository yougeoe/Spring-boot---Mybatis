package com.bee.sample.controller;

import com.bee.sample.domain.Entity.User;
import com.bee.sample.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    private UserService userService;
    @RequestMapping("/get/{id}")
    public User get(@PathVariable Integer id) throws Exception{
        return userService.findById(id);
    }

}
