package com.cagmeini.serviciosya.beans.entity;


import javax.persistence.*;

@Entity(name= "Province") // si quiero q hibernate reconozca a esta tabla como Country solamente
@Table(name="province") // para que java me encuentre la tabla por este nombre
public class ProvinceEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id" , nullable = false,insertable = false,updatable = false)
    private int id;

    @Column (name ="name", length = 48,nullable = false)
    private String name;

    @ManyToOne
    private CountryEntity country;
    
    
    // Constructors
    public ProvinceEntity() {
    	super();
    	
    }
    
    public ProvinceEntity(int id,String name) {
    	this.id = id;
    	this.name = name;
    	
    }

	
    
    // Getters & Setters

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

	public CountryEntity getCountry() {
		return country;
	}

	public void setCountry(CountryEntity country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "ProvinceEntity [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	
}
