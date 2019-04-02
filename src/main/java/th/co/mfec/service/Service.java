package th.co.mfec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import th.co.mfec.model.Product;
import th.co.mfec.repo.ProductRepository;

@Component
public class Service {
	
	@Autowired
	private ProductRepository productRepository;
	
	public void helloWorld() {
		System.out.print("Hello World Nice!");
	}
	
	public Product create(Product product) {
		return productRepository.save(product);
	}
}
