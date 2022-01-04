package com.shang.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Slf4j
public class PaymentController {
   @Value("${server.port}")
    private String serverPort;

    @GetMapping("/payment/zx")
    public String paymentzx(){
        return "spring cloud with zookeeper" + serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
