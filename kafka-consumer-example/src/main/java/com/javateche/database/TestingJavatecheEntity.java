package com.javateche.database;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name="testing_kafka")
@NoArgsConstructor
@AllArgsConstructor

public class TestingJavatecheEntity {
	
	@jakarta.persistence.Id
	public int id;
	public String name;
	public String partition;
	
	

}
