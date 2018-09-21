package com.cagmeini.serviciosya.beans.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;



	@Table (name="city")
	@Entity (name="City")
	public class CityEntity {

		@Id
		@GeneratedValue
		@Column (name="cit_id")
	    private Integer id = null;

		@ManyToOne (optional=false)
		@JoinColumn (name="pro_id", referencedColumnName="pro_id")
		private ProvinceEntity province = null;
		
		@Size (max = 100)
		@Column (name="cit_name", nullable=false, length = 100)
		private String name = null;



		// Constructors

		public CityEntity() {
			super();
		}

		public CityEntity(int id , ProvinceEntity province, String name) {

			this.id = id;
			this.province = province;
			this.name = name;
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public ProvinceEntity getProvince() {
			return province;
		}

		public void setProvince(ProvinceEntity province) {
			this.province = province;
		}

		
		
		
		
		
		
		
		
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			result = prime * result + ((province == null) ? 0 : province.hashCode());
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
			CityEntity other = (CityEntity) obj;
			if (id != other.id)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (province == null) {
				if (other.province != null)
					return false;
			} else if (!province.equals(other.province))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "CityEntity [id=" + id + ", name=" + name + ", province=" + province + "]";
		}






	}
