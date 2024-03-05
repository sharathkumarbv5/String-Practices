package com.example.demo.serviceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;
@Service
public abstract class ProductServiceimpl implements ProductService {
@Autowired
ProductRepository productrepository;

}
