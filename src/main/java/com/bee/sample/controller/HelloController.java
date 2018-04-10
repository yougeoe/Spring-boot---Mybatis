package com.bee.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class HelloController {
    @RequestMapping("/say")
    public  @ResponseBody String say(){
        return "hello Spring boot";
    }

}
