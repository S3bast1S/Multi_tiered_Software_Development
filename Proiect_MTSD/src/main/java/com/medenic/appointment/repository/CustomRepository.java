package com.medenic.appointment.repository;

import java.util.List;

import com.medenic.appointment.model.Appointment;

public interface CustomRepository{
    public List<Appointment> findAllByEmail(String email);
}