package com.medenic.appointment.repository;
import org.springframework.data.repository.CrudRepository;

import com.medenic.appointment.model.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor,String>{

}
