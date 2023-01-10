package com.medenic.appointment.repository;

import org.springframework.data.repository.CrudRepository;

import com.medenic.appointment.model.Appointment;

public interface AppointmentRepository extends CrudRepository<Appointment,String>,CustomRepository,CustomTwo{
	
}
