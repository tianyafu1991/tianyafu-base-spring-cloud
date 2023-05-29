package com.tianyafu.microserviceuser.service;

import com.tianyafu.microserviceuser.pojo.User;

import java.util.List;

public interface UserService {


    List<User> findAll();

    User findById(Integer id);

    void add(User user);

    void update(User user);

    void deleteById(Integer id);

    void addAll(List<User> users);
}
