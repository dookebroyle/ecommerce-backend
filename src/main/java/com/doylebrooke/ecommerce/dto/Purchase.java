package com.doylebrooke.ecommerce.dto;

import com.doylebrooke.ecommerce.entity.Address;
import com.doylebrooke.ecommerce.entity.Customer;
import com.doylebrooke.ecommerce.entity.Order;
import com.doylebrooke.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data

public class Purchase {

    private Customer customer;

    private Address shippingAddress;

    private Address billingAddress;

    private Order order;

    private Set<OrderItem> orderItems;




}
