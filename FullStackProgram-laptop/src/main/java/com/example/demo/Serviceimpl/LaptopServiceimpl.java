package com.example.demo.Serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.LaptopsRepository;
import com.example.demo.Service.LaptopsService;
import com.example.demo.entity.Laptops;

@Service
public class LaptopServiceimpl implements LaptopsService {
	@Autowired
	LaptopsRepository laptopsrepository;

	@Override
	public List<Laptops> getLaptops() {
		return laptopsrepository.findAll();
	}

	
}
