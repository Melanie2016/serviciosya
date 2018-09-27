package com.cagmeini.serviciosya.api.beans.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;


@Table (name="city")
@Entity (name="City")
public class CityEntity { 
	
	
	@Id
	@GeneratedValue
	@Column (name="cit_id")
    private Integer id = null;
	
//	@ManyToOne (optional=false)
//	@JoinColumn (name="pro_id", referencedColumnName="pro_id",nullable=false)
//	private ProvinceEntity province = null;
	
	@Size (max = 100)
	@Column (name="cit_name", nullable=false, length = 100)
	private String name = null;
	
	
	public CityEntity () {
		
		super ();
	}
	
	public CityEntity (Integer id, String name) {
		
		super ();
		
		this.id       = id;
	
		this.name = name;
	}

	
	public Integer getId () {

		return this.id;
	}
	
	public void setId (Integer id) {
		
		this.id = id;
	}
	
	
	
	public String getName () {
		
		return this.name;
	}
	
	public void setName (String name) {
		
		this.name = name;
	}
	
	
}