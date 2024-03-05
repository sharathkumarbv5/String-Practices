package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
@RestController
public class ProductController {
		@Autowired
		 ProductService productservice;
		@GetMapping(value="/val")
		public List<Product> getProduct() {
			return productservice.getProduct();
		}
		@GetMapping(value="/val{id}")
		public Product getProductById(@PathVariable Integer id) {
			return productservice.getProductById(id);
		}
		@PostMapping(value="/insert")
		public Product postProduct(@RequestBody Product product) {
			return productservice.postProduct(product);
		}
		@DeleteMapping(value="/delete/{id}")
		public String deleteProduct(@PathVariable("id") int id) {
			return productservice.deletetStudent(id);
		}
		@PutMapping(value="/update")
		public Product updateProduct(@RequestBody Product product) throws Exception {
			return productservice.updateStudent(product);
		}

}
