package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Order;
import com.springboot.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/order")
	public ResponseEntity<Order> addOrder(@RequestBody Order order){
		
		Order ordered=orderService.addOrders(order);
		
		return new ResponseEntity<Order>(ordered,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/orders")
	public ResponseEntity<List<Order>> getAllOrders(){
		
		List<Order>allOrders=orderService.getAllOrders();
		
		return new ResponseEntity<List<Order>>(allOrders,HttpStatus.CREATED);
	}
}
