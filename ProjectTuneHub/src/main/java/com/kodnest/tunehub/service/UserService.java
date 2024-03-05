package com.kodnest.tunehub.service;

import org.springframework.stereotype.Service;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

//import org.springframework.web.bind.annotation.ModelAttribute;

import com.kodnest.tunehub.entity.User;
//import com.kodnest.tunehub.repository.UserRepository;
@Service
public interface UserService {
	public String addUser(User user);
	public boolean emailExists(String email);
	public boolean validateUser(String email, String password);
	public String getRole(String email);
	public User getUser(String email);
	public void updateUser(User user);

}

