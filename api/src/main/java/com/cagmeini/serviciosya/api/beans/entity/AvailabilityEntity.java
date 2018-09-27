package com.cagmeini.serviciosya.api.beans.entity;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

//@Entity(name = "Availability")
//@Table (name = "availability")
public class AvailabilityEntity {

	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@GeneratedValue
    @Column(name = "availability_id", nullable = false, insertable = false, updatable = false)
    private int id;
	
	@Column(name = "start_time", nullable = false, insertable = false, updatable = false)
	private LocalTime startTime;
	
	@Column(name = "end_time", nullable = false, insertable = false, updatable = false)
	private LocalTime endTime;

	@Column(name = "day_of_attention", nullable = false, insertable = false, updatable = false)
	private String dayOfAttention;
	
//	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
//    @JoinTable(name = "occupation_x_availability",
//             joinColumns = {@JoinColumn(name = "availability_id")},
//             inverseJoinColumns = {@JoinColumn(name = "occupation_id")})
//    private Set<OccupationEntity> occupations = new HashSet<>();
//	
//	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
//    @JoinTable(name = "provider_x_availability",
//    		joinColumns = {@JoinColumn(name = "availability_id")},
//    		inverseJoinColumns = {@JoinColumn(name = "provider_id")})
//	private Set<ProviderEntity> providers = new HashSet<>();
	
	
	
	public AvailabilityEntity() {
		super();
	}
	
	
	
	public AvailabilityEntity(int id,LocalTime startTime, LocalTime endTime ,String day ) {
		this.id = id;
		this.startTime = startTime;
		this.endTime = endTime;
		this.dayOfAttention = day;
	
	}




	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public LocalTime getStartTime() {
		return startTime;
	}



	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}



	public LocalTime getEndTime() {
		return endTime;
	}



	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}



	public String getDayOfAttention() {
		return dayOfAttention;
	}



	public void setDayOfAttention(String dayOfAttention) {
		this.dayOfAttention = dayOfAttention;
	}



	

	
	
}

