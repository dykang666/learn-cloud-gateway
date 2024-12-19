package com.example.service.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author kangdongyang
 * @version 1.0
 * @description:
 * @date 2024/12/18 20:47
 */
@RestController
@RequestMapping("/service5")
public class ServiceController5 {


    @RequestMapping("/hello")
    public String hello() throws UnknownHostException {
        // 获取本地主机对象
        InetAddress localHost = InetAddress.getLocalHost();
        String hostAddress = localHost.getHostAddress();
        return "service5:hello:8081:"+hostAddress;
    }
}
