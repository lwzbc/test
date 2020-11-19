package com.fh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("demo")
public class DemoController {
    @RequestMapping("test")
    public      String   test(){
        return "success======";
    }
    @RequestMapping("test1")
    public      String   test1(){
        return "error";
    }
}
