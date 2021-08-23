package com.dinj.docclinic.current.model;

import com.dinj.docclinic.current.model.base.Person;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "PATIENT_CONTACT")
public class PatientContact extends Person {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "patientContact")
    private Set<Patient> patients = new HashSet<>();

    @Column(name = "CITY")
    private String city;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "ADDRESS")
    private String address;

    public PatientContact(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Set<Patient> getPatients() {
        return patients;
    }

    public void setPatients(Set<Patient> patients) {
        this.patients = patients;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
