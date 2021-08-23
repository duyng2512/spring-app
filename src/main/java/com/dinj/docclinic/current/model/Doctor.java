package com.dinj.docclinic.current.model;

import com.dinj.docclinic.current.model.base.Person;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "DOCTOR")
public class Doctor extends Person {

    public Doctor(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "DOC_SPECIALTIES",
            joinColumns = @JoinColumn(name = "DOCTOR_ID"),
            inverseJoinColumns = @JoinColumn(name = "SPECIALTY_ID"))
    private Set<Specialty> specialties;

    public Doctor() {
        super();
    }

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}
