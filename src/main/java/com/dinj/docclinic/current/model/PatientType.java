package com.dinj.docclinic.current.model;

import com.dinj.docclinic.current.model.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "PATIENT_TYPE")
public class PatientType extends BaseEntity {

    @Column(name = "NAME")
    private String name;

    @Column(name = "CODE")
    private String code;

    public PatientType(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public PatientType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
