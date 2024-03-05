package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Laptops;
@Service
public interface LaptopsService {
List<Laptops> getLaptops();
}
