package com.cyc.springcloud.controller;

import com.cyc.springcloud.entity.User;
import com.cyc.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

/**
 * 类注释
 * Req* @author 塔塔
 *
 * @date 2021/12/15 17:50
 **/
@RestController
@RequestMapping("/user")
@RefreshScope
public class UserController {

    @Value("${hhe.value}")
    private String port;

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public String get() {
        return port;
    }

    @PostMapping("add")
    public void add(@RequestBody User user) {
        userService.save(user);
    }
}    