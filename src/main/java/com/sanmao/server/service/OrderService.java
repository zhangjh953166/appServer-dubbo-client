package com.sanmao.server.service;

import java.util.List;

import com.sanmao.server.model.Order;

public interface OrderService {
	public List<Order> query(Order dto);
}
