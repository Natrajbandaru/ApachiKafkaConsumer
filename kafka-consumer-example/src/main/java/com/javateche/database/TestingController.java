package com.javateche.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/test")
public class TestingController {

	@Autowired
	TestingRepo repo;
	

	@GetMapping("/pop")
	 public void mainData() {
		
		TestingJavatecheEntity tester= new TestingJavatecheEntity();
		tester.name = "sss";
		tester.partition = "partition1";
		repo.save(tester);
	 }
}
