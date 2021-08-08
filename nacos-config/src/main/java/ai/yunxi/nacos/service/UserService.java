package ai.yunxi.nacos.service;

import ai.yunxi.nacos.dao.UserDao;
import ai.yunxi.nacos.entity.User;
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
