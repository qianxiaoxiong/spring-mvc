package com.myringle.SpringMVC.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserController implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello");
        mv.addObject("msg","hell0 cgb1805");

        return mv;
    }

}
