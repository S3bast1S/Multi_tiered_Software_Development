package com.medenic.appointment.repository;

import org.springframework.data.repository.CrudRepository;

import com.medenic.appointment.model.Person;

public interface PersonRepository extends CrudRepository<Person,String>{
	
}
