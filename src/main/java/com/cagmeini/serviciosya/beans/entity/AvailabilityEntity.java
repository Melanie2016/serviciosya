package com.cagmeini.serviciosya.beans.entity;

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

@Entity(name = "Availability")
@Table (name = "availability")
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
	
	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "occupation_x_availability",
             joinColumns = {@JoinColumn(name = "availability_id")},
             inverseJoinColumns = {@JoinColumn(name = "occupation_id")})
    private Set<OccupationEntity> occupations = new HashSet<>();
	
	@ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "provider_x_availability",
    		joinColumns = {@JoinColumn(name = "availability_id")},
    		inverseJoinColumns = {@JoinColumn(name = "provider_id")})
	private Set<ProviderEntity> providers = new HashSet<>();
	
	
	
	public AvailabilityEntity() {
		super();
	}
	
	
	
	public AvailabilityEntity(int id,LocalTime startTime, LocalTime endTime,String day) {
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



	public Set<OccupationEntity> getOccupations() {
		return occupations;
	}



	public void setOccupations(Set<OccupationEntity> occupations) {
		this.occupations = occupations;
	}



	public Set<ProviderEntity> getProviders() {
		return providers;
	}



	public void setProviders(Set<ProviderEntity> providers) {
		this.providers = providers;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dayOfAttention == null) ? 0 : dayOfAttention.hashCode());
		result = prime * result + ((endTime == null) ? 0 : endTime.hashCode());
		result = prime * result + id;
		result = prime * result + ((occupations == null) ? 0 : occupations.hashCode());
		result = prime * result + ((providers == null) ? 0 : providers.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AvailabilityEntity other = (AvailabilityEntity) obj;
		if (dayOfAttention == null) {
			if (other.dayOfAttention != null)
				return false;
		} else if (!dayOfAttention.equals(other.dayOfAttention))
			return false;
		if (endTime == null) {
			if (other.endTime != null)
				return false;
		} else if (!endTime.equals(other.endTime))
			return false;
		if (id != other.id)
			return false;
		if (occupations == null) {
			if (other.occupations != null)
				return false;
		} else if (!occupations.equals(other.occupations))
			return false;
		if (providers == null) {
			if (other.providers != null)
				return false;
		} else if (!providers.equals(other.providers))
			return false;
		if (startTime == null) {
			if (other.startTime != null)
				return false;
		} else if (!startTime.equals(other.startTime))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

