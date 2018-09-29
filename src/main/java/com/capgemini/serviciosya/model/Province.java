package com.capgemini.serviciosya.model;

import javax.persistence.*;





@Entity (name="Province")
@Table (name="province")
public class Province {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name="pro_id")
	private int id ;
	
	
	@Column (name ="name", length = 48,nullable = false)
	private String name ;
	
	
	@ManyToOne
	@JoinColumn (name="country_id")
    private Country country;
	
	public Province() {
		
	}
	
	
	public Province(int id, String name) {
		this.id = id;
		this.name = name;
		
	}
	

}
