package com.doylebrooke.ecommerce.service;


import com.doylebrooke.ecommerce.dto.Purchase;
import com.doylebrooke.ecommerce.dto.PurchaseResponse;


public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
