package com.zhy.gulimall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
*   1.想要远程调用别的服务
*   1）引入open-feign
*   2）编写一个接口，告诉SpringCloud这个接口需要调用远程服务
*       1.声明接口的每一个方法否是调用哪个远程服务的哪个请求
* */
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients(basePackages = "com.zhy.gulimall.member.feign")
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class,args);
    }
}
