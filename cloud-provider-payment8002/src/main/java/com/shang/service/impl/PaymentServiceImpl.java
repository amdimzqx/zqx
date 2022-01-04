package com.shang.service.impl;


import com.shang.entities.Payment;

import org.springframework.stereotype.Service;
import com.shang.dao.PaymentDao;
import com.shang.service.PaymentService;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;


    @Override
    public int add(Payment payment) {
        return paymentDao.add(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
