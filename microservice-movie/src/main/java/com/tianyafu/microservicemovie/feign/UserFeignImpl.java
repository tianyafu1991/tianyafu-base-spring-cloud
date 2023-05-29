package com.tianyafu.microservicemovie.feign;

import com.tianyafu.microservicemovie.pojo.User;
import org.springframework.stereotype.Component;

/**
 * 熔断器类
 */
@Component
public class UserFeignImpl implements UserFeign{
    @Override
    public User findById(Integer id) {
        System.out.println("执行了熔断器的方法");
        return null;
    }
}
