
package com.capgemeini.serviciosya.beans.entity;


import javax.persistence.*;


@Entity (name = "City")
@Table (name = "city")
public class CityEntity {


    // Map the fields (Database tables ) and properties (Java classes)
    @Id
    @GeneratedValue (strategy=GenerationType.IDENTITY)
    @Column (name = "id", nullable = false, insertable = false, updatable = false)
    private int id;

    @Column (name = "name", length = 48, nullable = false)
    private String name;

    /*
    @ManyToOne
    @JoinColumn (name="province_id")
    private ProvinceEntity province;
    */

    public CityEntity() {

        super ();
    }

    public CityEntity(int id, String name) {

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



    @Override
    public String toString () {

        return this.name;
    }
}