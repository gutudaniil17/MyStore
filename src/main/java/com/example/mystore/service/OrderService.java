package com.example.mystore.service;

import com.example.mystore.model.Order;

public interface OrderService {
    Iterable<Order> getAllOrders();
    Order create(Order order);
    void update(Order order);
}
