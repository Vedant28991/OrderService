package com.springboot.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Order;
import com.springboot.repository.OrderRepo;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderRepo orderRepo;
	
	@Override
	public Order addOrders(Order order) {
		
		Order o=orderRepo.save(order);
		
		return o;
	}

	@Override
	public List<Order> getAllOrders() {
		
		Iterator<Order> it=orderRepo.findAll().iterator();
		
		List<Order>li=new ArrayList<>();
		
		while(it.hasNext()) {
			li.add(it.next());
		}
		
		return li;
	}

}
