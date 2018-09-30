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


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Province getProvince() {
		return province;
	}


	public void setProvince(Province province) {
		this.province = province;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((province == null) ? 0 : province.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		return true;
	}
	
	
	
	
}
