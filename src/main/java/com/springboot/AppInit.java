package com.springboot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description:
 * @author: chenmingjian
 * @date: 19-2-1 10:39
 */
@Slf4j
@SpringBootApplication
@EnableFeignClients
public class AppInit {

    public static void main(String[] args) {
        log.info("项目启动开始...");
        SpringApplication.run(AppInit.class,args);
        log.info("项目启动成功...");
    }
}
