package com.kyle.springboot.PetClinic.services;

import com.kyle.springboot.PetClinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
