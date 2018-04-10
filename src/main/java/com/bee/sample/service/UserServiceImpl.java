package com.bee.sample.service;

import com.bee.sample.domain.Entity.User;
import com.bee.sample.domain.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Override
    public int save(User user) throws Exception {
        return userDao.insert(user);
    }

    @Override
    public int del(Integer id) throws Exception {
        return userDao.del(id);
    }

    @Override
    public int update(User user) throws Exception {
        return userDao.update(user);
    }

    @Override
    public User findById(Integer id) throws Exception {
        return userDao.get(id);
    }

    @Override
    public List<User> getList(User user) throws Exception {
        return userDao.getList(user);
    }
}
