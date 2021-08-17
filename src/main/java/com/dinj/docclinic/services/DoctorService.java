package com.dinj.docclinic.services;

import com.dinj.docclinic.current.model.Doctor;

import java.util.Set;

public interface DoctorService {

    Doctor save(Doctor doctor);
    Doctor findById(Long id);
    Doctor findByLastName(String lastName);
    Set<Doctor> findAll();

}
