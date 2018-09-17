package com.cagmeini.serviciosya.beans.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

@Entity(name = "Service")
@Table(name = "service" )
public class ServiceEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false, updatable = false)
    private int id;
	
	private LocalDate date;
	
	private String category;
	
	private LocalTime time;  
	
	
	@ManyToOne 
	@JoinColumn(name="consumer_id")
	private ConsumerEntity consumers ;
	
}
