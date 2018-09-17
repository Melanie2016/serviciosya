package com.cagmeini.serviciosya.beans.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity(name = "Availability")
@Table (name = "availability")
public class AvailabilityEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, insertable = false, updatable = false)
    private int id;
	
	@Column(name = "start_time", nullable = false, insertable = false, updatable = false)
	private LocalDate startTime;
	
	@Column(name = "end_time", nullable = false, insertable = false, updatable = false)
	private LocalDate endTime;

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
	
	
	
}
