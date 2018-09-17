package com.cagmeini.serviciosya.beans.entity;

import java.time.LocalDate;

import javax.persistence.*;

@Entity(name = "Service")
@Table(name = "service" )
public class ServiceEntity {

	@Id
	private int id;
	
	private LocalDate date;
	
	private String category;
	
	
	
}
