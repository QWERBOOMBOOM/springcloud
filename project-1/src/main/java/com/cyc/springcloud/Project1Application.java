package com.cyc.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 类注释
 *
 * @author 塔塔
 * @date 2021/12/15 17:43
 **/
@EnableDiscoveryClient
@SpringBootApplication
@Slf4j
public class Project1Application {
    public static void main(String[] args) {
        SpringApplication.run(Project1Application.class, args);
        log.info("project1 started");
    }

}    