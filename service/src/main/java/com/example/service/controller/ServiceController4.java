package com.example.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/18 20:47
 */
@RestController
@RequestMapping("/service4")
public class ServiceController4 {


    @RequestMapping("/hello")
    public String hello(String name){
        return "service4:hello:8081:"+name;
    }
}
