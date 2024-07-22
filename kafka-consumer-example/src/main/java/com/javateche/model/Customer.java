package com.javateche.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="customer_table")
public class Customer {
	
	@Id
	public int id;
	public String name;
	public String email;
	public String contact;
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", contact=" + contact + "]";
	}
	
}
