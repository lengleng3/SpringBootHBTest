package com.icelake.test.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Description 服务启动类
 * @author hb0818
 * @date 2020/12/07
 */
@SpringBootApplication(scanBasePackages = {"com.icelake.test.application"})
@EnableFeignClients({"com.icelake"})

public class StartSpringBootHBTest {
    public static void main(String[] args){
        SpringApplication.run(StartSpringBootHBTest.class,args);
    }

}
