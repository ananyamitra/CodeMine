package com.inventory.services;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.vo.Order;

@RestController
public class OrderService {
	
	@RequestMapping("/orders")
	public Order getOrders(@RequestParam(value="user_id") String userId){
		
		System.out.println("Received request to get order for user "+userId);		
		return new Order();
		
	}
	

}
