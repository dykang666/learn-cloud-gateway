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
@RequestMapping("/service2")
public class ServiceController2 {


    @RequestMapping("/getHello")
    public String getHello(){
        return "get:Hello:service2:8081";
    }
}
