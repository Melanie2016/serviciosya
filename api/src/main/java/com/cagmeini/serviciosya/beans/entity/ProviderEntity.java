package com.cagmeini.serviciosya.beans.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Range;

@NamedQueries({

       @NamedQuery(

           name  = "ProviderFindByPhone",
           query = "from Provider p where p.phone = :phone"
         )
})
@Entity(name = "Provider")
@Table(name = "provider")
public class ProviderEntity {

	// Map the fields (Database tables ) and properties (Java classes)
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue
    @Column(name = "provider_id", nullable = false, insertable = false, updatable = false)
    private int id;

    @Column(name = "name", length = 48, nullable = false)
    private String name;

    @Column(name = "lastname", length = 48, nullable = false)
    private String lastName;

    @Column(name = "phone", length = 48, nullable = false, unique = true)
    private String phone;

    @Column(name = "dni", nullable = false, unique = true)
    private Integer dni;

    @Size(min = 15, max = 100)
    @Email
    @Column(name = "email", length = 128, nullable = false, unique = true)
    private String email;

    @Column(name = "address", length = 128, nullable = false)
    private String address;

    @Range(min = 0, max = 2)
    @Column(name = "status", nullable = true)
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "city_id",nullable = true)
    private CityEntity city;


//    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
//    @JoinTable(name = "occupation_x_provider",
//            joinColumns = {@JoinColumn(name = "provider_id")},
//            inverseJoinColumns = {@JoinColumn(name = "occupation_id")})
//    private Set<OccupationEntity> occupations = new HashSet<>();

    @ManyToMany(mappedBy="providers")   
    private Set<AvailabilityEntity> availabilitys = new HashSet<>();

    
    
    
    public ProviderEntity() {

        super();
    }

    public ProviderEntity(int id, String name,String lastName,String phone,Integer dni,String email,String address ,CityEntity city) {

 
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.dni = dni;
        this.email = email;
        this.address = address;
        this.city = city;
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

  

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public CityEntity getCity() {
        return city;
    }

    public void setCity(CityEntity city) {
        this.city = city;
    }

    
    
    
    
    
    
    
    
    
    
    

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((availabilitys == null) ? 0 : availabilitys.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		ProviderEntity other = (ProviderEntity) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (availabilitys == null) {
			if (other.availabilitys != null)
				return false;
		} else if (!availabilitys.equals(other.availabilitys))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

	@Override
    public String toString() {

        return this.name;
    }
       



    }