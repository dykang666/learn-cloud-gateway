package com.example.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.UnknownHostException;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/18 20:47
 */
@RestController
@RequestMapping("/service8")
public class ServiceController8 {


    @RequestMapping("/hello")
    public String hello() throws UnknownHostException {
        return "service8:hello:8081";
    }
}
