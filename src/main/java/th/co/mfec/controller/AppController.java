package th.co.mfec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import th.co.mfec.model.Product;
import th.co.mfec.service.AppService;

@RestController
public class AppController {
	
	@Autowired
	private AppService service;
	
	@PostMapping("/api/HelloWorld")
	public String helloWorld() {
		return service.helloWorld();
	}
	
	@PostMapping("/api/product/create")
	public Product create(@RequestBody Product product) {
		return service.create(product);
	}
}
