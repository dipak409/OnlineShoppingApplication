package com.cg.onlineshoppingapplication.entities;

import java.time.LocalDate;
import java.util.Map;

public class Order {
	private String orderId;
	private LocalDate orderDate;
	private String orderStatus;
	private Customer customer;
	private Map productList;
	private Address address;
}
