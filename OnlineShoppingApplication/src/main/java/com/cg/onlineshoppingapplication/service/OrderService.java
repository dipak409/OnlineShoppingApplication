package com.cg.onlineshoppingapplication.service;

import java.time.LocalDate;
import java.util.List;
import com.cg.onlineshoppingapplication.entities.Orders;

public interface OrderService {
	
	Orders addOrder(Orders order);
	Orders updateOrder(Orders order);
	Orders removeOrder(Orders order);
	Orders viewOrder(Orders order);
	List<Orders> viewAllOrders(LocalDate date);
	List<Orders> viewAllOrdersByLocation(String location);
	List<Orders> viewAllOrdersByUserId(String userId);

}
