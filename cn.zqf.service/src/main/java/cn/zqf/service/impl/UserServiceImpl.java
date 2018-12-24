package cn.zqf.service.impl;

import cn.zqf.dao.UserDao;
import cn.zqf.domain.User;
import cn.zqf.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImpl implements Userservice {

    @Autowired
    private UserDao dao;

    public List<User> findAll() {
        return dao.findAll();
    }
}
