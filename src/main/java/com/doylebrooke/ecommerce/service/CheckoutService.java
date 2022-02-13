package com.doylebrooke.ecommerce.service;


import com.doylebrooke.ecommerce.dto.PaymentInfo;
import com.doylebrooke.ecommerce.dto.Purchase;
import com.doylebrooke.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;


public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;
}
