package cn.itcast.controller;


import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

    /**
     * 处理请求的方法
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("hello请求进来了...");
        //包含数据和视图
        ModelAndView mv = new ModelAndView();
        //添加一个数据 request.setAttribute(key,value)
        mv.addObject("msg","这是第一个SpringMVC程序！");
        //设置视图名称
        mv.setViewName("hello");
        return mv;
    }
}
