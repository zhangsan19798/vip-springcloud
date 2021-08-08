package ai.yunxi.nacos.controller;

import ai.yunxi.nacos.entity.User;
import ai.yunxi.nacos.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;



import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/provider")
public class UserController {
    @Value("${spring.datasource.password}")
    private String password;
    @Autowired
    private UserService userService;
    @RequestMapping("/{id}")
    User findUser(@PathVariable("id") Long id){
        System.out.println("=============="+password);
        return userService.findUser(id);
    }
}
