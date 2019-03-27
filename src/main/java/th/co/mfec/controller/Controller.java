package th.co.mfec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import th.co.mfec.service.Service;

@RestController
public class Controller {
	
	@Autowired
	private Service service;
	
	@PostMapping("/api/HelloWorld")
	public void helloWorld() {
		service.helloWorld();
	}
}
