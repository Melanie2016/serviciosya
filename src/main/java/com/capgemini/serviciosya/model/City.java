package com.capgemini.serviciosya.model;

import javax.persistence.*;
import javax.validation.constraints.Size;




@Entity (name="City")
@Table (name="city")
public class City {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="city_id")
	private int id ;
	
	//size parea validar 
	@Size (max = 100)
	@Column (name="cit_name", nullable=false, length = 100)
	private String name ;
	
	
	
	@ManyToOne (optional=false)
	@JoinColumn (name="pro_id", referencedColumnName="pro_id")
	private Province province = null;
	
	
	
	public City () {
		
	}
	
	
	public City (int id , String name) {
		this.id = id ;
		this.name = name;
		
	}
}
