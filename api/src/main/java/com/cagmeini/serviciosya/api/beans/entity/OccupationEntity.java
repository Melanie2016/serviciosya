package com.cagmeini.serviciosya.api.beans.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity(name= "Occupation")
@Table(name="occupation")
public class OccupationEntity {


	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="occupation_id" , nullable = false,insertable = false,updatable = false)
    private int id;

    @Column (name ="name", length = 48,nullable = false)
    private String name;

    @Column (name ="description", length = 48,nullable = false)
    private String description;

    @ManyToOne
	@JoinColumn (name = "parent",nullable = true)
	private OccupationEntity parent;

//	@ManyToMany (mappedBy="occupations")
//	private Set<ProviderEntity> providers = new HashSet<>();
	
	@ManyToMany (mappedBy="occupations") // es el nombre del atributo en la clase que mapea
	private Set<AvailabilityEntity> availability = new HashSet<>();


    // Constructors

    public OccupationEntity() {
    	super();
    }


    public OccupationEntity(int id, String name, String desc ,OccupationEntity parent) {
    	this.id = id;
    	this.name = name;
    	this.description = desc;
    	this.parent = parent;
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


	public Set<AvailabilityEntity> getAvailability() {
		return availability;
	}


	public void setAvailability(Set<AvailabilityEntity> availability) {
		this.availability = availability;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((availability == null) ? 0 : availability.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parent == null) ? 0 : parent.hashCode());
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
		OccupationEntity other = (OccupationEntity) obj;
		if (availability == null) {
			if (other.availability != null)
				return false;
		} else if (!availability.equals(other.availability))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parent == null) {
			if (other.parent != null)
				return false;
		} else if (!parent.equals(other.parent))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "OccupationEntity [id=" + id + ", name=" + name + ", description=" + description + ", parent=" + parent
				+ ", availability=" + availability + "]";
	}

    
    
    
    

	


}
