package com.yzx.springboot07deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @program: springboot-07-deploy
 * @description: todo
 * @author: yanzhixian
 * @create: 2020-07-15 23:29
 */
@Controller
public class HelloController {

    @GetMapping("/abc")
//    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}