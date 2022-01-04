package com.shang.dao;

import com.shang.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {
    public int add(Payment payment);
    public Payment getPaymentById(@Param("id") long id);
}
