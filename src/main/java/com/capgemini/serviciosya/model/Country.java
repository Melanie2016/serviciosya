package com.capgemini.serviciosya.model;

import javax.persistence.*;




@Entity (name="Country")
@Table (name="country")
public class Country {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="country_id")
	private int id ;
	
	
	@Column (name ="name", length = 48,nullable = false)
	private String name ;
	
	
	
	public Country() {
		
	}
	
	public Country(int id , String name) {
		this.id = id;
		this.name = name;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
