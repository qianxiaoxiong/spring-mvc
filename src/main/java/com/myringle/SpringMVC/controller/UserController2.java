package com.myringle.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class UserController2 {

    @GetMapping("user/hello")
    public String hello() {
        return "hello";
    }


    @GetMapping("user/test")
    @ResponseBody
    public String test() {
        return "adfsfdasfsadfasfsaf";
    }
}
