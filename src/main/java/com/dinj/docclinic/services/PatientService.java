package com.dinj.docclinic.services;

import com.dinj.docclinic.current.model.Patient;
import com.dinj.docclinic.current.model.Relative;

import java.util.Set;

public interface PatientService {

    Patient save(Patient patient);
    Patient findById(Long id);
    Set<Patient> findAll();
    
}
