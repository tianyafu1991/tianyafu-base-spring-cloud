package com.tianyafu.microservicemovie.feign;

import com.tianyafu.microservicemovie.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 用户微服务远程接口
 * 三个注意事项
 * 1.使用@FeignClient注解 其中value填写要调用的服务的应用名
 * 2.检查调用路径是否完整 因为Controller上面也有路径
 * 3.@PathVariable注解的value不能省略
 */
@FeignClient(value = "microservcie-user")
@RequestMapping("/user")
public interface UserFeign {

    @GetMapping("/findById/{id}")
    User findById(@PathVariable(value = "id") Integer id);
}
