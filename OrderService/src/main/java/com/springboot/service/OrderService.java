package com.springboot.service;

import java.util.List;

import com.springboot.entity.Order;

public interface OrderService {

	Order addOrders(Order order);

	List<Order> getAllOrders();

}
