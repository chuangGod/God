package com.cloud.sp01.service;

import com.cloud.sp01.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	void addOrder(Order order);
}