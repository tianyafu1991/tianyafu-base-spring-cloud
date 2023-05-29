package com.tianyafu.microserviceuser.controller;

import com.tianyafu.microserviceuser.pojo.User;
import com.tianyafu.microserviceuser.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        userService.add(user);
        return "添加成功";
    }

    @PostMapping("/addAll")
    public String addAll(@RequestBody List<User> users) {
        userService.addAll(users);
        return "添加成功";
    }

    @GetMapping("/findAll")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/findById/{id}")
    public User findById(@PathVariable Integer id) {
        return userService.findById(id);
    }

    @PutMapping("/update/{id}")
    public String update(@RequestBody User user, @PathVariable Integer id) {
        user.setId(id);
        userService.update(user);
        return "修改成功";
    }

    @DeleteMapping("/deleteById/{id}")
    public String deleteById(@PathVariable Integer id){
        userService.deleteById(id);
        return "删除成功";
    }


}
