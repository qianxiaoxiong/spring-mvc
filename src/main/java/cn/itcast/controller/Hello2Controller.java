package cn.itcast.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
@RequestMapping("hello")
public class Hello2Controller {

    @RequestMapping("show1")
    public ModelAndView test1(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","这是第一个基于注解的SpringMVC程序");
        mv.setViewName("hello2");
        return mv;
    }

    @RequestMapping("sss?/show2")
    public ModelAndView test2(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","ant风格映射");
        mv.setViewName("hello2");
        return mv;
    }

    @RequestMapping("aa*/show3")
    public ModelAndView test3(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","ant风格映射:*");
        mv.setViewName("hello2");
        return mv;
    }

    @RequestMapping("**/show4")
    public ModelAndView test4(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","ant风格映射:**");
        mv.setViewName("hello2");
        return mv;
    }



    @RequestMapping("show5/{id}/{name}")
    public ModelAndView test5(@PathVariable("id") Long id,@PathVariable("name") String name){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","占位符风格映射:id:" + id + "，name:" + name);
        mv.setViewName("hello2");
        return mv;
    }


    @RequestMapping(value="show6",method = RequestMethod.POST)
    public ModelAndView test6(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","限定请求方法映射:POST");
        mv.setViewName("hello2");
        return mv;
    }

    @RequestMapping(value="show7",method = RequestMethod.PUT)
    public ModelAndView test7(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","限定请求方法映射:PUT");
        mv.setViewName("hello2");
        return mv;
    }

    @RequestMapping(value="show8",method = RequestMethod.DELETE)
    public ModelAndView test8(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","限定请求方法映射:DELETE");
        mv.setViewName("hello2");
        return mv;
    }



    @RequestMapping(value="show9",params = "id")
    public ModelAndView test9(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","限定请求参数映射:必须要有id");
        mv.setViewName("hello2");
        return mv;
    }


    @RequestMapping(value="show10",params = "!id")
    public ModelAndView test10(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","限定请求参数映射:必须不能有id");
        mv.setViewName("hello2");
        return mv;
    }


    @RequestMapping(value="show11",params = "id=1")
    public ModelAndView test11(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","限定请求参数映射:必须有id，且值等于1");
        mv.setViewName("hello2");
        return mv;
    }

    @RequestMapping(value="show12",params = "id!=1")
    public ModelAndView test12(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","限定请求参数映射:id!=1");
        mv.setViewName("hello2");
        return mv;
    }

    @RequestMapping(value="show13",params = {"id","name"})
    public ModelAndView test13(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","限定请求参数映射:必须有id和name");
        mv.setViewName("hello2");
        return mv;
    }





    @GetMapping("show14")
    public ModelAndView test14(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","@GetMapping");
        mv.setViewName("hello2");
        return mv;
    }

    @PostMapping("show15")
    public ModelAndView test15(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","@PostMapping");
        mv.setViewName("hello2");
        return mv;
    }

    @PutMapping("show16")
    public ModelAndView test16(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","@PutMapping");
        mv.setViewName("hello2");
        return mv;
    }


    @DeleteMapping("show17")
    public ModelAndView test17(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","@DeleteMapping");
        mv.setViewName("hello2");
        return mv;
    }



    @RequestMapping("show18")
    public ModelAndView test18(@RequestParam(value = "id",required = true,defaultValue = "222") Long id){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","接收普通请求中的参数：id" + id);
        mv.setViewName("hello2");
        return mv;
    }



    @RequestMapping("show19")
    public ModelAndView test19(
            @RequestParam("username") String username,
            @RequestParam("age") Integer age,
            @RequestParam("isMarry") Boolean isMarry,
            @RequestParam("income") Double income,
            @RequestParam(value = "hobby",required = false) String[] hobby) {

        ModelAndView mv = new ModelAndView();
        mv.addObject("msg","username:" + username + ";age:" + age + ";isMarry:" + isMarry + ";income:" +income + ";hobby:" + Arrays.toString(hobby));
        mv.setViewName("hello2");
        return mv;
    }









}
