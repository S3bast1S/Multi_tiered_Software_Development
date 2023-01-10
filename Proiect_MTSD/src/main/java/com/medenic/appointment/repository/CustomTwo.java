package com.medenic.appointment.repository;

import java.util.List;

import com.medenic.appointment.model.Appointment;

public interface CustomTwo{
    public List<Appointment> findByDocId(String docId);
}