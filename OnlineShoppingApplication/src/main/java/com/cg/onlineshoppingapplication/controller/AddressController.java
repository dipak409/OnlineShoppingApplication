package com.cg.onlineshoppingapplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.onlineshoppingapplication.entities.Address;
import com.cg.onlineshoppingapplication.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	
	
	public AddressController(AddressService addressService) {
		super();
		this.addressService = addressService;
	}

	@PostMapping("/create")
	public Address create(@RequestBody Address add)
	{
		 return addressService.addAddress(add);
	}
	
	@PutMapping("/update")
	public 	Address update(@RequestBody Address add)
	{
		return addressService.updateAddress(add);
	}
	
	
	@DeleteMapping("/remove")
	public Address delete(@RequestBody Address add)
	{
	
		return addressService.removeAddress(add);
	}
	
	@GetMapping("/all")
	public List<Address> viewAddress()
	{
		return addressService.viewAllAddress();
	}
}
