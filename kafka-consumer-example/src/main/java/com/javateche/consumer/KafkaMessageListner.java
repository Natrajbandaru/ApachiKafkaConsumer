package com.javateche.consumer;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.javateche.database.TestingJavatecheEntity;
import com.javateche.database.TestingRepo;



@Service
public class KafkaMessageListner {

	@Autowired
	TestingRepo repo;
	
	Logger log= (Logger) LoggerFactory.getLogger(KafkaMessageListner.class);
	
	public int num=1;
	
//	@KafkaListener(topics="javaTeche-demo8",groupId="jt-group3")
//	public void consumes1(String message) {
//		log.info("consume the message1{} --", message);
//		TestingJavatecheEntity tester= new TestingJavatecheEntity();
//		tester.id=num;
//		tester.name = message;
//		tester.partition = "partition1";
//		repo.save(tester);
//		num++;
//	}
//	@KafkaListener(topics="javaTeche-demo8",groupId="jt-group3")
//	public void consume2(String message) {
//		log.info("consume the message2{} --", message);
//		TestingJavatecheEntity tester= new TestingJavatecheEntity();
//		tester.id=num;
//		tester.name = message;
//		tester.partition = "partition2";
//		repo.save(tester);
//		num++;
//	}
//	@KafkaListener(topics="javaTeche-demo8",groupId="jt-group3")
//	public void consume3(String message) {
//		log.info("consume the message3{} --", message);
//		TestingJavatecheEntity tester= new TestingJavatecheEntity();
//		tester.id=num;
//		tester.name = message;
//		tester.partition = "partition3";
//		repo.save(tester);
//		num++;
//
//	}
//	@KafkaListener(topics="javaTeche-demo8",groupId="jt-group3")
//	public void consume4(String message) {
//		log.info("consume the message4{} --", message);
//		TestingJavatecheEntity tester= new TestingJavatecheEntity();
//		tester.id=num;
//		tester.name = message;
//		tester.partition = "partition4";
//		repo.save(tester);
//		num++;
//
//	}
//	@KafkaListener(topics="javaTeche-demo8",groupId="jt-group3")
//	public void consume5(String message) {
//		log.info("consume the message5{} --", message);
//		TestingJavatecheEntity tester= new TestingJavatecheEntity();
//		tester.id=num;
//		tester.name = message;
//		tester.partition = "partition5";
//		repo.save(tester);
//		num++;
//
//	}

}
