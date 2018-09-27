package com.cagmeini.serviciosya.api.beans.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.*;

//@Entity(name = "Service")
//@Table(name = "service" )
public class ServiceEntity {

	@Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue
    @Column(name = "id", nullable = false, insertable = false, updatable = false)
    private int id;
	
	@Column(name = "date", nullable = false, insertable = false, updatable = false)
	private LocalDate date;
	
	
	@Column(name = "time", nullable = false, insertable = false, updatable = false)
	private LocalTime time;  
	
	// es ManyToOne porque considero a la clase servicio como el registro de 
	// servicios contratados un consumidor puede contratar varios servicios 
	// pero un proveedor no puede hacer dos services el mismo dia y horario o no deberia 
//	@ManyToOne 
//	@JoinColumn(name="consumer_id")
//	private ConsumerEntity consumers ;
//	
	
	public ServiceEntity() {
		
	}
	
	public ServiceEntity(int id, LocalDate date, LocalTime time ) {
		this.id = id;
		this.date = date;
		this.time = time;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

//	public ConsumerEntity getConsumers() {
//		return consumers;
//	}
//
//	public void setConsumers(ConsumerEntity consumers) {
//		this.consumers = consumers;
//	}

}
