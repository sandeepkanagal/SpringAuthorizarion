package com.ibm.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ReceiveOrderController {
	
	@Autowired
	private OrderRepository orderRepository;
	
	@RequestMapping(value = "/user/getOrderList", produces = "application/json")
    @ResponseBody
	public List<OrderService> getOrderList(){
		
		List<OrderService> orderList= orderRepository.findAll();
		System.out.println("orderList size ="+orderList.size());
		return orderList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private List<OrderService> getSampleOrderList()
	{
		OrderService orderService1 = new OrderService((long) 1, "Sandeep", "Samsung S9", 35000, 2,
				new Date() , "In progress", "info", "sandeep@mail.com", "Bangalore");
		OrderService orderService2 = new OrderService((long) 1, "Sharath", "Moto G5", 10000, 1,
				new Date() , "In progress", "info", "sharath@mail.com", "Mangalore");
		OrderService orderService3 = new OrderService((long) 1, "Prashanth", "Oppo", 15000, 3,
				new Date() , "In progress", "info", "pras@mail.com", "Bangalore");
		OrderService orderService4 = new OrderService((long) 1, "Santosh", "iPhone", 55000, 1,
				new Date() , "In progress", "info", "santosh@mail.com", "Bangalore");
			
			List<OrderService> orderList= new ArrayList<OrderService>();
			orderList.add(orderService1);
			orderList.add(orderService2);
			orderList.add(orderService3);
			orderList.add(orderService4);
			
		return orderList;
	}

}
