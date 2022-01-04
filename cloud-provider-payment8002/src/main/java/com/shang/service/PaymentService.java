package com.shang.service;


import com.shang.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    public int add(Payment payment);
    public Payment getPaymentById(@Param("id") long id);
}
