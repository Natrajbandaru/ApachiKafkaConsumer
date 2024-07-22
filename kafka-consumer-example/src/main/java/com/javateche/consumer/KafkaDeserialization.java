package com.javateche.consumer;

import org.springframework.stereotype.Service;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.javateche.database.TestingJavatecheEntity;
import com.javateche.database.TestingRepo;
import com.javateche.model.Customer;
import com.javateche.model.CustomerRepo;


@Service
public class KafkaDeserialization {
	
//	@Autowired
//	TestingRepo repo;
	
	Logger log= (Logger) LoggerFactory.getLogger(KafkaDeserialization.class);
	
	@Autowired
	CustomerRepo repo;
	
	public int num=1;
	
	@KafkaListener(topics="javaTeche-demo11",groupId="jt-group8")
	public void consume1w(Customer customer) {
		customer.id=num;
		log.info("consume the customer{} --", customer.toString());
//		repo.save(customer);
		num++;
		/*
		 * TestingJavatecheEntity tester= new TestingJavatecheEntity(); tester.id=num;
		 * tester.name = message; tester.partition = "partition1"; repo.save(tester);
		 * num++;
		 */
	}

}
