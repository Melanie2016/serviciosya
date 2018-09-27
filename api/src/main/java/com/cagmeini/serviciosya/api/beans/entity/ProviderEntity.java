package com.cagmeini.serviciosya.api.beans.entity;

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

//@NamedQueries({
//
//       @NamedQuery(
//
//           name  = "ProviderFindByPhone",
//           query = "from Provider p where p.phone = :phone"
//         )
//})
//@Entity(name = "Provider")
//@Table(name = "provider")
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
//
//    @ManyToOne
//    @JoinColumn(name = "city_id",nullable = true)
//    private CityEntity city;
//

//    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
//    @JoinTable(name = "occupation_x_provider",
//            joinColumns = {@JoinColumn(name = "provider_id")},
//            inverseJoinColumns = {@JoinColumn(name = "occupation_id")})
//    private Set<OccupationEntity> occupations = new HashSet<>();

//    @ManyToMany(mappedBy="providers")   
//    private Set<AvailabilityEntity> availabilitys = new HashSet<>();

    
    
    
    public ProviderEntity() {

        super();
    }

    public ProviderEntity(int id, String name,String lastName,String phone,Integer dni,String email,String address ) {

 
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.phone = phone;
        this.dni = dni;
        this.email = email;
        this.address = address;

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

  
    
    
    
    
    
    
    
    
    
    


    }