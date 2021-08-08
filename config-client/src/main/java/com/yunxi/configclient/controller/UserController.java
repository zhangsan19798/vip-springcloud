package com.yunxi.configclient.controller;

import com.yunxi.configclient.entity.User;
import com.yunxi.configclient.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/provider")
public class UserController {

    @Value("${spring.datasource.password}")
    private String password;

    @Autowired
    private UserService userService;

    @RequestMapping("/{id}")
    public User findUser(@PathVariable Long id) {
        System.out.println("==========" + password);
        return userService.findUser(id);
    }
}
