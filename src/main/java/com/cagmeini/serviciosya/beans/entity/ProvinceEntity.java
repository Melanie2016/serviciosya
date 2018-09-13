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
}
