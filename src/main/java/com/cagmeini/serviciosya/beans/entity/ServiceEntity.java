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
	
	@Column(name = "date", nullable = false, insertable = false, updatable = false)
	private LocalDate date;
	
	
	@Column(name = "time", nullable = false, insertable = false, updatable = false)
	private LocalTime time;  
	
	
	@ManyToOne 
	@JoinColumn(name="consumer_id")
	private ConsumerEntity consumers ;
	
	
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

	public ConsumerEntity getConsumers() {
		return consumers;
	}

	public void setConsumers(ConsumerEntity consumers) {
		this.consumers = consumers;
	}
	
	
	
}
