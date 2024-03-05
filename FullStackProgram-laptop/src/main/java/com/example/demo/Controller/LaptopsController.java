package com.example.demo.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Service.LaptopsService;
import com.example.demo.entity.Laptops;
@RestController
public class LaptopsController {
	@Autowired
	 LaptopsService laptopsservice;
		@GetMapping(value="/laptops")
		public List<Laptops> getLaptops() {
			return laptopsservice.getLaptops();
		}
}
