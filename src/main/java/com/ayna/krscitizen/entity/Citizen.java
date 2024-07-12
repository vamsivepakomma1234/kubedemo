

package com.ayna.krscitizen.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cititbl")
public class Citizen {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long citizenId;
           
    @Column(name="name")
	private String name;
    
    @Column(name="area")
	private String area;

	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Citizen(Long citizenId, String name, String area) {
		super();
		this.citizenId = citizenId;
		this.name = name;
		this.area = area;
	}

	public Long getCitizenId() {
		return citizenId;
	}

	public void setCitizenId(Long citizenId) {
		this.citizenId = citizenId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Citizen [citizenId=" + citizenId + ", name=" + name + ", area=" + area + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, citizenId, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Citizen other = (Citizen) obj;
		return Objects.equals(area, other.area) && Objects.equals(citizenId, other.citizenId)
				&& Objects.equals(name, other.name);
	}
    
    
}

