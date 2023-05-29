package com.tianyafu.microserviceuser.dao;

import com.tianyafu.microserviceuser.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User,Integer> {
}
