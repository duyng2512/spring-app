package com.dinj.docclinic.services;

import com.dinj.docclinic.current.model.Relative;

import java.util.Set;

public interface RelativeService {

    Relative save(Relative relative);
    Relative findById(Long id);
    Relative findByLastName(String lastName);
    Set<Relative> findAll();

}
