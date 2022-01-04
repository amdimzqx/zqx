package com.shangwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Oderzk80 {
    public static void main(String[] args) {
        SpringApplication.run(Oderzk80.class,args);
    }
}
