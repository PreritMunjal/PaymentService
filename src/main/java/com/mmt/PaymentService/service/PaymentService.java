package com.mmt.PaymentService.service;

import com.mmt.PaymentService.model.PaymentRequest;
import com.mmt.PaymentService.model.PaymentResponse;

public interface PaymentService {
    long doPayment(PaymentRequest paymentRequest);

    PaymentResponse getPaymentDetailsByOrderId(String orderId);
}
