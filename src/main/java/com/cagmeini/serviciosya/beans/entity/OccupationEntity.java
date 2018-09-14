package com.cagmeini.serviciosya.beans.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name= "Occupation")
@Table(name="occupation")
public class OccupationEntity {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id" , nullable = false,insertable = false,updatable = false)
    private int id;

    @Column (name ="name", length = 48,nullable = false)
    private String name;

    @Column (name ="description", length = 48,nullable = false)
    private String description;
    
    @ManyToOne
    private OccupationEntity parent;
    
    
    // Constructors
    
    public OccupationEntity() {
    	super();
    }
    
    
    public OccupationEntity(int id, String name, String desc) {
    	this.id = id;
    	this.name = name;
    	this.description = desc;
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


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public OccupationEntity getParent() {
		return parent;
	}


	public void setParent(OccupationEntity parent) {
		this.parent = parent;
	}
    
    
    
    
    
    
    
    
    
    
}
