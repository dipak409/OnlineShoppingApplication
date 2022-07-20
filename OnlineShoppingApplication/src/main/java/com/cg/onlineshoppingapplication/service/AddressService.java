package com.cg.onlineshoppingapplication.service;

import java.util.List;

import com.cg.onlineshoppingapplication.entities.Address;

public interface AddressService {
	
	Address addAddress(Address add);
	Address updateAddress(Address add);
	Address removeAddress(Address add);	
	Address viewAddress(String id);
	List<Address> viewAllAddress();

}
