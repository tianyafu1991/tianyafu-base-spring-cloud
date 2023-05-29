package com.tianyafu.microserviceuser.service.impl;

import com.tianyafu.microserviceuser.dao.UserDao;
import com.tianyafu.microserviceuser.pojo.User;
import com.tianyafu.microserviceuser.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id).get();
    }

    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Override
    public void addAll(List<User> users) {
        userDao.saveAll(users);
    }

    @Override
    public void update(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteById(Integer id) {
        userDao.deleteById(id);
    }
}
