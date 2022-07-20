package com.cg.onlineshoppingapplication.service;

import com.cg.onlineshoppingapplication.entities.Login;

public interface LoginService {
	
	Login addUser (Login login);
	Login removeUser (Login login);
	Login validateUser (Login login);
	Login signOut (Login login);
	
	
}
