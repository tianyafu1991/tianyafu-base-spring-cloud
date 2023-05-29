package com.tianyafu.microserviceuser.myTest;

import com.alibaba.fastjson.JSON;
import com.tianyafu.microserviceuser.pojo.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MyTest {

    @Test
    public void getUsersJson(){
        List<User> users = new ArrayList<>();
        users.add(new User(1, "张三", "123456", "男", 1000D));
        users.add(new User(2, "李四", "123456", "男", 2000D));
        users.add(new User(3, "貂蝉", "123456", "女", 3000D));
        System.out.println(JSON.toJSONString(users, true));
    }
}
