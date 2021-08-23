package com.dinj.docclinic.current.model;

import com.dinj.docclinic.current.model.base.Person;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PATIENT")
public class Patient extends Person {

    @ManyToOne
    @JoinColumn(name = "PATIENT_CONTRACT_ID")
    private PatientContact patientContact;

    @ManyToOne
    @JoinColumn(name = "TYPE_ID")
    private PatientType patientType;

    @Column(name = "BIRTHDATE")
    private LocalDate birthDate;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patient")
    private Set<Visit> visitSet = new HashSet<>();

    public Patient(String firstName,
                   String lastName,
                   PatientContact patientContact,
                   PatientType patientType,
                   LocalDate birthDate) {
        super(firstName, lastName);
        this.patientContact = patientContact;
        this.patientType = patientType;
        this.birthDate = birthDate;
    }

    public Patient() {}

    public PatientContact getRelative() {
        return patientContact;
    }

    public void setRelative(PatientContact patientContact) {
        this.patientContact = patientContact;
    }

    public PatientType getPatientType() {
        return patientType;
    }

    public void setPatientType(PatientType patientType) {
        this.patientType = patientType;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public PatientContact getPatientContact() {
        return patientContact;
    }

    public void setPatientContact(PatientContact patientContact) {
        this.patientContact = patientContact;
    }

    public Set<Visit> getVisitSet() {
        return visitSet;
    }

    public void setVisitSet(Set<Visit> visitSet) {
        this.visitSet = visitSet;
    }
}
