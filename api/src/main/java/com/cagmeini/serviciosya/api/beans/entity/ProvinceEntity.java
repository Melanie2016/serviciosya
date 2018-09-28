package com.cagmeini.serviciosya.api.beans.entity;


import javax.persistence.*;
import javax.validation.constraints.Size;

@Table (name="province")
@Entity (name="Province")
public class ProvinceEntity {


    @Id
    @GeneratedValue
    @Column (name="pro_id")
    private Integer pro_id = null;

//    @ManyToOne (optional=false)
//    @JoinColumn (name="cou_id", referencedColumnName="cou_id")
//    private CountryEntity country = null;

    @Size (max = 100)
    @Column (name="name", nullable=false, length = 100)
    private String name = null;


    public ProvinceEntity () {

        super ();
    }

    public ProvinceEntity (Integer id, String name) {

        super ();

        this.pro_id   = id;
   
        this.name = name;
    }


    public Integer getId () {

        return this.pro_id;
    }

    public void setId (Integer id) {

        this.pro_id = id;
    }

    public String getName () {

        return this.name;
    }

    public void setName (String name) {

        this.name = name;
    }


    
}