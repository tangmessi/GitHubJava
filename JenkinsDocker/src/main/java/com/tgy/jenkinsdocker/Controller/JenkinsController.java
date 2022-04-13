package com.tgy.jenkinsdocker.Controller;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/***
 * @ClassName: JenkinsController
 * @Description:
 * @Auther: 送你一块二向箔
 * @Date: 17:52 2022/4/13
 * @version : V1.0
 */
@RestController
public class JenkinsController {
    @Resource
    StringRedisTemplate redis;
    @GetMapping("/hello")
    public String hello(){
        redis.opsForValue().increment("hello",1);
        return "hello jenkins docker 访问次数："+redis.opsForValue().get("hello");
    }
}
