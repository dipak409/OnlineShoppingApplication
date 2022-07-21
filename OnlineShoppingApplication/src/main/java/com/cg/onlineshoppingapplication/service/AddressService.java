package com.cg.onlineshoppingapplication.service;

import java.util.List;
import java.util.Optional;

import com.cg.onlineshoppingapplication.entities.Address;

public interface AddressService {
	
	Address addAddress(Address add);
	Address updateAddress(Address add);
	Address removeAddress(Address add);	
	Address viewAddress(int id);
	List<Address> viewAllAddress();

}
