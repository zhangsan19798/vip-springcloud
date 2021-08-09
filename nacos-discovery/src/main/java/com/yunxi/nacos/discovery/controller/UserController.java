package com.yunxi.nacos.discovery.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/consumer")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/{id}")
    public User getUserInfo(@PathVariable Long id) {
        // 没有使用注册中心 IP+PORT方式
        // return restTemplate.getForObject("http://localhost:8080/provider"+id, User.class);
        return restTemplate.getForObject("http://springcloud-client/provider/" + id, User.class);
    }

}
