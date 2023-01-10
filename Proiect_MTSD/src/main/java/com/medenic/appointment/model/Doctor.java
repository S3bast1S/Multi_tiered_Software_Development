package com.medenic.appointment.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="DOCTOR")
public class Doctor {
	@Id
	private String email;
	private String name;
    @Enumerated(EnumType.STRING)
	private SpecializationEnum specialization;
	private String city;	
	private String password;
	


	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public SpecializationEnum getSpecialization() {
		return specialization;
	}
	public void setSpecialization(SpecializationEnum specialization) {
		this.specialization = specialization;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
