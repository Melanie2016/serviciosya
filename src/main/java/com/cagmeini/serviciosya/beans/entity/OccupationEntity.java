package com.cagmeini.serviciosya.beans.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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
	@JoinColumn ( name = "parent",nullable = true)
	private OccupationEntity parent;

	@ManyToMany (mappedBy="occupations")
	private Set<ProviderEntity> providers = new HashSet<>();


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

	public Set<ProviderEntity> getProviders() {

		return providers;
	}

	public void setProviders(Set<ProviderEntity> providers) {

		this.providers = providers;
	}

	@Override
	public String toString() {
		return "OccupationEntity{" +
				"name='" + name + '\'' +
				'}';
	}
}
