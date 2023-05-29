package com.tianyafu.microservicemovie.controller;

import com.tianyafu.microservicemovie.feign.UserFeign;
import com.tianyafu.microservicemovie.pojo.User;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

//    @Resource
//    private RestTemplate restTemplate;

    @Resource
    private UserFeign userFeign;



    /**
     * 使用openFeign
     * @return
     */
    @PostMapping("/order")
    public String order(){
        // 模拟当前用户
        Integer id = 3;
        User user = userFeign.findById(id);
/*        List<ServiceInstance> instances = discoveryClient.getInstances("microservcie-user");
        ServiceInstance serviceInstance = instances.get(0);
        User user = restTemplate.getForObject("http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/findById/" + id, User.class);*/
        System.out.println(user + "正在购票......");
        return "购票成功";
    }
}
