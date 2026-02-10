package com.charles.springbootmall.service;

import com.charles.springbootmall.dto.CreateOrderRequest;
import com.charles.springbootmall.dto.OrderQueryParams;
import com.charles.springbootmall.model.Order;

import java.util.List;

public interface OrderService {

    Integer countOrder(OrderQueryParams orderQueryParams);

    List<Order> getOrders(OrderQueryParams orderQueryParams);

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
