package com.shang.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo(Integer id) {
        return  "----------PaymentFallbackService fall back-paymentInfo";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return  "----------PaymentFallbackService fall back-paymentInfo_TimeOut";
    }
}
