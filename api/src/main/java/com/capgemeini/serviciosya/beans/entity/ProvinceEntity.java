
package com.capgemeini.serviciosya.beans.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity (name = "Province")
@Table (name = "province")
public class ProvinceEntity {


    // Map the fields (Database tables ) and properties (Java classes)
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column (name = "pro_id", nullable = false, insertable = false, updatable = false)
    private int id;

    @Column (name = "name", length = 48, nullable = false)
    private String name;


    @ManyToOne
    @JoinColumn (name="cou_id")
    private CountryEntity country;




    public ProvinceEntity () {

        super ();
    }

    public ProvinceEntity (int id, String name, CountryEntity country) {

        super ();

        this.id = id;
        this.name = name;

    }


    public int getId () {

        return id;
    }

    public void setId (int id) {

        this.id = id;
    }

    public String getName () {

        return name;
    }

    public void setName (String name) {

        this.name = name;
    }

    public CountryEntity getCountry() {
        return country;
    }

    public void setCountry(CountryEntity country) {
        this.country = country;
    }

    @Override
    public String toString () {

        return this.name;
    }
}