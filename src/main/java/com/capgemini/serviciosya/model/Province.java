package com.capgemini.serviciosya.model;

import javax.persistence.*;





@Entity (name="Province")
@Table (name="province")
public class Province {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="pro_id")
	private int id ;
	
	
	@Column (name ="name", length = 48,nullable = false)
	private String name ;
	
	
	@ManyToOne
	@JoinColumn (name="country_id")
    private Country country;
	
	public Province() {
		
	}
	
	
	public Province(int id, String name) {
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


	public Country getCountry() {
		return country;
	}


	public void setCountry(Country country) {
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
		Province other = (Province) obj;
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
	
	
	
	
	
	
	
	
	

}
