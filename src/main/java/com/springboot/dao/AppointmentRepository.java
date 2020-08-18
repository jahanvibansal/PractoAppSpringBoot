package com.springboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.dto.Appointment;
import com.springboot.dto.Patient;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
	public List<Appointment> findByPatient(Patient patient);
}
