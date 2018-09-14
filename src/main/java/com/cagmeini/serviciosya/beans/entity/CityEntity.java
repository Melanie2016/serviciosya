package com.cagmeini.serviciosya.beans.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name= "City")
@Table(name="city") 
public class CityEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id" , nullable = false,insertable = false,updatable = false)
    private int id;

    @Column (name ="name", length = 48,nullable = false)
    private String name;

    @ManyToOne
    private ProvinceEntity province;
    
    
    
    // Constructors
    
    public CityEntity() {
    	super();
    }
    
    public CityEntity(int id , String name) {
    	
    	this.id = id;
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

	public ProvinceEntity getProvince() {
		return province;
	}

	public void setProvince(ProvinceEntity province) {
		this.province = province;
	}

	@Override
	public String toString() {
		return "CityEntity [id=" + id + ", name=" + name + ", province=" + province + "]";
	}
    
    
    
    
    
	
}
