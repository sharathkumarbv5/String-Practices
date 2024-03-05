package com.example.demo.service;
import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Product;
@Service
public interface ProductService {
	public List<Product> getProduct();
	public Product getProductById(Integer id);
	public Product postProduct(Product product);
	public String deletetStudent(int id);
	public Product updateStudent(Product product);

}
