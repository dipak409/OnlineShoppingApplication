package com.cg.onlineshoppingapplication.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.onlineshoppingapplication.entities.Address;
import com.cg.onlineshoppingapplication.repositories.AddressRepository;

@Service
public class AddressServiceImpl implements AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public AddressServiceImpl(AddressRepository addressRepository) {
		super();
		this.addressRepository = addressRepository;
	}

	@Override
	public Address addAddress(Address add) {
		// TODO Auto-generated method stub
		return addressRepository.save(add);
	}

	@Override
	public Address updateAddress(Address add) {
		// TODO Auto-generated method stub
		if(addressRepository.findById(add.getAddressId()).isPresent())
		{
			//System.out.println("Address Successfully Updated");
			return addressRepository.save(add);
		}
			
			return null;
	
	}

	@Override
	public Address removeAddress(Address add) {
		// TODO Auto-generated method stub
		if(addressRepository.findById(add.getAddressId()).isPresent())
		{
			//Address address=new Address();
			addressRepository.deleteById(add.getAddressId());
			System.out.println("Deleted");
			return null;
		}
		else
		{
			System.out.println("Not Deleted");
			return null;
		}
		
	}

	@Override
	public Address viewAddress(String id) {
		// TODO Auto-generated method stub
		if(addressRepository.findById(id) != null)
		{
			return addressRepository.findById(id);
		}
		return null;
		
	}

	@Override
	public List<Address> viewAllAddress() {
		// TODO Auto-generated method stub
		return addressRepository.findAll();
	}

}
