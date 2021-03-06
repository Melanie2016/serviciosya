package com.cagmeini.serviciosya.beans.entity;


import javax.persistence.*;

@Entity(name= "Province") // si quiero q hibernate reconozca a esta tabla como Country solamente
@Table(name="province") // para que java me encuentre la tabla por este nombre
public class ProvinceEntity {


    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue
    @Column(name="id" , nullable = false,insertable = false,updatable = false)
    private int id;

    @Column (name ="name", length = 48,nullable = false)
    private String name;

    @ManyToOne
	@JoinColumn (name="country_id")
    private CountryEntity country;
    
    
    // Constructors
    public ProvinceEntity() {
    	super();
    	
    }
    
    public ProvinceEntity(int id,String name,CountryEntity country) {
    	this.id = id;
    	this.name = name;
    	this.country = country;
    	
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		ProvinceEntity other = (ProvinceEntity) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProvinceEntity [id=" + id + ", name=" + name + ", country=" + country + "]";
	}
	
	
}
