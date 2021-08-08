package com.yunxi.configclient.service;


import com.yunxi.configclient.dao.UserDao;
import com.yunxi.configclient.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;
    public User findUser(Long id) {
        return userDao.findOne(id);
    }
}
