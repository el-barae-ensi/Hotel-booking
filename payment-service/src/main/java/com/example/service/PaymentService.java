package com.example.service;

import com.example.entity.Payment;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface PaymentService {
    List<Payment> getAllPayments();
    Payment getPaymentById(Long id);
    Payment createPayment(Payment payment);
    Payment updatePayment(Long id, Payment payment);
    void deletePayment(Long id);
}
